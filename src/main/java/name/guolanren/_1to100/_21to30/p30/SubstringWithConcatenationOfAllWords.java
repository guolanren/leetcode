package name.guolanren._1to100._21to30.p30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @link https://leetcode.com/problems/substring-with-concatenation-of-all-words/
 * @author guoyaozhan
 */
public class SubstringWithConcatenationOfAllWords {

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> indices = new ArrayList<>();
        if (words.length == 0) {
            return indices;
        }

        Map<String, Integer> targetWordFreq = new HashMap<>(words.length);
        for (String word : words) {
            targetWordFreq.put(word, targetWordFreq.getOrDefault(word, 0) + 1);
        }

        int wordSize = words[0].length();
        int windowSize = wordSize * words.length;
        for (int i = 0; i < wordSize; i++) {
            for (int j = i; j + windowSize <= s.length(); j += wordSize) {
                String subStr = s.substring(j, j + windowSize);
                Map<String, Integer> subStrWordFreq = new HashMap<>(words.length);
                for (int k = words.length - 1; k >= 0; k--) {
                    String word = subStr.substring(k * wordSize, (k + 1) * wordSize);
                    int freq = subStrWordFreq.getOrDefault(word, 0) + 1;
                    if (freq > targetWordFreq.getOrDefault(word, 0)) {
                        j = j + k * wordSize;
                        break;
                    } else if (k == 0) {
                        indices.add(j);
                    } else {
                        subStrWordFreq.put(word, freq);
                    }
                }
            }
        }
        return indices;
    }

}

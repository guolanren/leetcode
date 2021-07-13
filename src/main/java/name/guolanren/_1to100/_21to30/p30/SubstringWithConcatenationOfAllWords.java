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
        for (int i = 0; i < s.length() - windowSize; i++) {
            String subStr = s.substring(i, i + windowSize);
            Map<String, Integer> subStrWordFreq = new HashMap<>(words.length);
            for (int j = words.length - 1; j >= 0; j--) {
                String word = subStr.substring(j * wordSize, (j + 1) * wordSize);
                int freq = subStrWordFreq.getOrDefault(word, 0) + 1;
                if (freq > targetWordFreq.getOrDefault(word, 0)) {
                    i = i + j * wordSize;
                    break;
                } else if (j == 0) {
                    indices.add(i);
                } else {
                    subStrWordFreq.put(word, freq);
                }
            }
        }
        return indices;
    }

}

package name.guolanren._1to100._1to10.p3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @link https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * @author guolanren
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Map<Character, Integer> record = new HashMap<>();
        for (int i = 0, j = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            Integer idx = record.get(c);
            if (idx == null || idx < j) {
                max = Math.max(max, i - j + 1);
            } else {
                j = idx + 1;
            }
            record.put(c, i);
        }
        return max;
    }

}

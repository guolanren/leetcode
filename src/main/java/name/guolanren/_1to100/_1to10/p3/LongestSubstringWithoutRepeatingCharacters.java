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
        int length = s.length();
        int max = 0;
        int from = 0;
        Map<Character, Integer> record = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (length - from <= max) {
                break;
            }
            Character c = s.charAt(i);
            Integer idx = record.get(c);
            if (idx == null || idx < from) {
                max = Math.max(max, i - from + 1);
            } else {
                from = idx + 1;
            }
            record.put(c, i);
        }
        return max;
    }

//    public int lengthOfLongestSubstring(String s) {
//        int maxLength = 0;
//        int byeIndex = 0;
//        // 乱序的候选最长字符串
//        Set<Character> candidate = new HashSet<>();
//        for (int i = 0; i < s.length(); i++) {
//            // 已经追不上啦，放弃吧
//            if (s.length() - i + candidate.size() <= maxLength) {
//                break;
//            }
//            char c = s.charAt(i);
//            // 遇到重复的，按顺序删除，直到跟相同的字符说 bye 为止
//            while (candidate.contains(c)) {
//                char bye = s.charAt(byeIndex++);
//                candidate.remove(bye);
//            }
//            candidate.add(c);
//            maxLength = Integer.max(maxLength, candidate.size());
//        }
//        return maxLength;
//    }

}

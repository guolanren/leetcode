package name.guolanren._1to100._71to80.p76;

import java.util.HashMap;
import java.util.Map;

/**
 * @link https://leetcode.com/problems/minimum-window-substring/
 * @author guolanren
 */
public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        Map<Character, Integer> needCharCount = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            int count = needCharCount.getOrDefault(c, 0) + 1;
            needCharCount.put(c, count);
        }

        int fromIndex = 0;
        int toIndex = 0;
        int minStart = 0;
        int minLen = Integer.MAX_VALUE;
        int enoughChar = 0;
        Map<Character, Integer> windowCharCount = new HashMap<>(needCharCount.size());
        while (toIndex < s.length()) {
            char c = s.charAt(toIndex++);
            if (needCharCount.containsKey(c)) {
                int windowCount = windowCharCount.getOrDefault(c, 0) + 1;
                windowCharCount.put(c, windowCount);
                if (windowCount == needCharCount.get(c)) {
                    enoughChar++;
                }
            }

            while (needCharCount.size() == enoughChar) {
                if (toIndex - fromIndex < minLen) {
                    minStart = fromIndex;
                    minLen = toIndex - fromIndex;
                }
                char pollChar = s.charAt(fromIndex);
                if (needCharCount.containsKey(pollChar)) {
                    int windowCount = Math.max(windowCharCount.get(pollChar) - 1, 0);
                    windowCharCount.put(pollChar, windowCount);
                    if (windowCount + 1 == needCharCount.get(pollChar)) {
                        enoughChar--;
                    }
                }
                fromIndex++;
            }

        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }

}

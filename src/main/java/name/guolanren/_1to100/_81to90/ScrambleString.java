package name.guolanren._1to100._81to90;

import java.util.HashMap;
import java.util.Map;

/**
 * @link https://leetcode.com/problems/scramble-string/
 * @author guolanren
 */
public class ScrambleString {

    private Map<String, Boolean> record = new HashMap<>();

    public boolean isScramble(String s1, String s2) {
        return isScramble(s1, 0, s1.length(), s2, 0, s2.length());
    }

    private boolean isScramble(String s1, int from1, int to1, String s2, int from2, int to2) {
        String key = from1 + "," + to1 + "-" + from2 + "," + to2;
        if (record.containsKey(key)) {
            return record.get(key);
        }

        boolean res = false;
        int length = to1 - from1;

        if (!sameOrigin(s1.substring(from1, to1), s2.substring(from2, to2))) {
            res = false;
        } else if (length == 1) {
            res = s1.charAt(from1) == s2.charAt(from2);
        } else {
            for (int i = 1; i < length; i++) {
                if ((isScramble(s1, from1, from1 + i, s2, from2, from2 + i) && isScramble(s1, from1 + i, to1, s2, from2 + i, to2))
                        || isScramble(s1, from1, to1 - i, s2, from2 + i, to2) && isScramble(s1, to1 - i, to1, s2, from2, from2 + i)) {
                    res = true;
                    break;
                }
            }
        }
        record.put(key, res);
        return res;
    }

    private boolean sameOrigin(String s1, String s2) {
        Map<Character, Integer> letterCount = new HashMap<>();
        for (Character c : s1.toCharArray()) {
            Integer count = letterCount.getOrDefault(c, 0);
            letterCount.put(c, ++count);
        }

        for (Character c : s2.toCharArray()) {
            Integer count = letterCount.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            } else if (count == 1) {
                letterCount.remove(c);
            } else {
                letterCount.put(c, --count);
            }
        }
        return letterCount.isEmpty();
    }

}

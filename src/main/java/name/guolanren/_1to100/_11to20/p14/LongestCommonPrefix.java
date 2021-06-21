package name.guolanren._1to100._11to20.p14;

/**
 * @link https://leetcode.com/problems/longest-common-prefix/
 * @author guolanren
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        int length = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (i >= strs[j].length() || i >= strs[j + 1].length() || strs[j].charAt(i) != strs[j + 1].charAt(i)) {
                    return strs[0].substring(0, length);
                }
            }
            length++;
        }
        return strs[0].substring(0, length);
    }

}

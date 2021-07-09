package name.guolanren._1to100._21to30.p28;

/**
 * @link https://leetcode.com/problems/implement-strstr/
 * @author guolanren
 */
public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            for (int j = 0; j < needle.length() / 2 + 1; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)
                        || haystack.charAt(i + needle.length() - j - 1) != needle.charAt(needle.length() - j - 1)) {
                    break;
                } else if (j == needle.length() - 1) {
                    return i;
                }
            }
        }
        return -1;
    }

}

package name.guolanren._1to100._31to40.p38;

/**
 * @link https://leetcode.com/problems/count-and-say/
 * @author guolanren
 */
public class CountAndSay {

    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder("1");
        while (--n > 0) {
            String s = sb.toString();
            sb.setLength(0);
            int counter = 0;
            char curChar = '*';
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == curChar) {
                    counter++;
                } else {
                    if (counter != 0) {
                        sb.append(counter);
                        sb.append(curChar);
                    }
                    counter = 1;
                    curChar = s.charAt(i);
                }
                if (i == s.length() - 1) {
                    sb.append(counter);
                    sb.append(curChar);
                }
            }
        }
        return sb.toString();
    }

}

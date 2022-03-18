package name.guolanren._1to100._51to60.p58;

/**
 * @link https://leetcode.com/problems/length-of-last-word/
 * @author guolanren
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        return s.trim().length() - s.trim().lastIndexOf(' ') - 1;
    }

}

package name.guolanren._1to100._11to20.p17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @link https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * @author guolanren
 */
public class LetterCombinationsOfAPhoneNumber {

    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();
        List<String> keyboard = Arrays.asList("0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");
        if (digits.length() == 1) {
            for (char c : keyboard.get(Character.getNumericValue(digits.charAt(0))).toCharArray()) {
                results.add(String.valueOf(c));
            }
        } else if (digits.length() > 1) {
            List<String> subResult = letterCombinations(digits.substring(1));
            for (char c : keyboard.get(Character.getNumericValue(digits.charAt(0))).toCharArray()) {
                for (String subStr : subResult) {
                    results.add(c + subStr);
                }
            }
        }
        return results;
    }

}

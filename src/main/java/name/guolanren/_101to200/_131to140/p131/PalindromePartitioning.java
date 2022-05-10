package name.guolanren._101to200._131to140.p131;

import java.util.ArrayList;
import java.util.List;

/**
 * @link https://leetcode.com/problems/palindrome-partitioning/
 * @author guolanren
 */
public class PalindromePartitioning {

    List<List<String>> palindromes = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backtrack(s, s.length(), 0, new ArrayList<>());
        return palindromes;
    }

    private void backtrack(String s, int length, int index, List<String> palindrome) {
        if (index == length) {
            palindromes.add(new ArrayList<>(palindrome));
            return;
        }
        for (int i = index + 1; i <= s.length(); i++) {
            String str = s.substring(index, i);

            if (isPalindrome(str)) {
                palindrome.add(str);
                backtrack(s, length, i, palindrome);
                palindrome.remove(palindrome.size() - 1);
            }
        }
    }

    private Boolean isPalindrome(String s) {
        int from = 0;
        int to = s.length() - 1;
        while (from < to) {
            if (s.charAt(from) != s.charAt(to)) {
                return false;
            }
            from++;
            to--;
        }
        return true;
    }

}

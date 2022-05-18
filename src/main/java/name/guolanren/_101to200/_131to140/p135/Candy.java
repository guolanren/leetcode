package name.guolanren._101to200._131to140.p135;

/**
 * @link https://leetcode.com/problems/candy/
 * @author guolanren
 */
public class Candy {

    public int candy(int[] ratings) {
        int candies = 1;
        int prev = 1;
        int down = 0;
        int peek = 0;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i - 1] < ratings[i]) {
                down = 0;
                prev++;
                peek = prev;
                candies += prev;
            } else if (ratings[i - 1] == ratings[i]) {
                down = 0;
                prev = 1;
                peek = prev;
                candies += prev;
            } else {
                down++;
                prev = 1;
                candies += 1 + down + (down >= peek ? 0 : -1);
            }
        }
        return candies;
    }

}
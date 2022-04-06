package name.guolanren._1to100._91to100.p96;

/**
 * @link https://leetcode.com/problems/unique-binary-search-trees/
 * @author guolanren
 */
public class UniqueBinarySearchTrees {

    int[] record = new int[19];

    public int numTrees(int n) {
        return numTrees(1, n);
    }

    private int numTrees(int from, int to) {
        if (from > to) {
            return 1;
        }
        if (record[to - from] != 0) {
            return record[to - from];
        }
        int num = 0;
        for (int i = from; i <= to; i++) {
            int leftNum = numTrees(from, i - 1);
            int rightNum = numTrees(i + 1, to);
            num += leftNum * rightNum;
        }
        record[to - from] = num;
        return num;
    }

}

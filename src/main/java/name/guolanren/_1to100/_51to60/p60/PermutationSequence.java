package name.guolanren._1to100._51to60.p60;

/**
 * @link https://leetcode.com/problems/permutation-sequence/
 * @author guolanren
 */
public class PermutationSequence {

    static int[] shard = new int[9];

    static {
        shard[0] = shard[1] = 1;
        for (int i = 2; i < shard.length; i++) {
            shard[i] = shard[i - 1] * i;
        }
    }

    public String getPermutation(int n, int k) {
        StringBuilder nums = new StringBuilder("123456789".substring(0, n));
        String kSeq = "";
        while (n > 0) {
            int times = (k - 1) / shard[n - 1];
            char num = nums.charAt(times);
            kSeq += num;
            nums.deleteCharAt(times);
            k -= times * shard[n - 1];
            n--;
        }
        return kSeq;
    }

}

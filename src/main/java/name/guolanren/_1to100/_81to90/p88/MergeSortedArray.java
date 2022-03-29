package name.guolanren._1to100._81to90.p88;

/**
 * @link https://leetcode.com/problems/merge-sorted-array/
 * @author guolanren
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m];
        for (int i = 0; i < m; i++) {
            nums3[i] = nums1[i];
        }

        int write = 0;
        int read2 = 0;
        int read3 = 0;
        while (read2 < n && read3 < m) {
            if (nums2[read2] <= nums3[read3]) {
                nums1[write++] = nums2[read2++];
            } else {
                nums1[write++] = nums3[read3++];
            }
        }

        while (read2 < n) {
            nums1[write++] = nums2[read2++];
        }

        while (read3 < m) {
            nums1[write++] = nums3[read3++];
        }
    }

}

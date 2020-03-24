package name.guolanren._1to100._1to10.p4;

/**
 * @author guolanren
 */
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 从左（小值）开始记录数
        int leftNum = Integer.MIN_VALUE;
        // 从右（大值）开始记录数
        int rightNum = Integer.MAX_VALUE;

        // 数组1左（小值）索引
        int nums1Left = 0;
        // 数组2左（小值）索引
        int nums2Left = 0;
        // 数组1右（大值）索引
        int nums1Right = nums1.length - 1;
        // 数组2右（大值）索引
        int nums2Right = nums2.length - 1;

        // 从两边向中间，直到两个记录数相遇
        while (true) {
            if (nums1Left > nums1Right) {
                if (nums2Left > nums2Right) {
                    break;
                }
                leftNum = nums2[nums2Left++];
                rightNum = nums2[nums2Right--];
            } else if (nums2Left <= nums2Right){
                leftNum = nums1[nums1Left] < nums2[nums2Left] ? nums1[nums1Left++] : nums2[nums2Left++];
                rightNum = nums1[nums1Right] > nums2[nums2Right] ? nums1[nums1Right--] : nums2[nums2Right--];
            } else {
                leftNum = nums1[nums1Left++];
                rightNum = nums1[nums1Right--];
            }
        }
        return (leftNum + rightNum) * 1.0 / 2;
    }

}

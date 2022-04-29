package findMedianSortedArrays;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/6 18:51
 */
public class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int length1 = num1.length, length2 = num2.length;
        int totalLength = length1 + length2;
        if (totalLength % 2 == 1) { // 取余是一，表示是奇数个元素。
            int midIndex = totalLength / 2;
            double median = getKthElement(num1, num2, midIndex + 1);    // midIndex + 1 表示中间的元素的索引。
            return median;
        } else {    // 元素个数是偶数个。
            int midIndex1 = totalLength / 2 - 1, midIndex2 = totalLength / 2;
            double median = (getKthElement(num1, num2, midIndex1 + 1) + getKthElement(num1, num2, midIndex2 + 1)) / 2.0;
            return median;
        }
    }

    public int getKthElement(int[] num1, int[] num2, int k) {
        // 边界情况



        // 正常情况

        return 0;
    }
}

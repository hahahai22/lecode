package findMedianSortedArrays;

/**
 * @author ������
 * @version 2021.2
 * @date 2022/4/6 18:51
 */
public class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int length1 = num1.length, length2 = num2.length;
        int totalLength = length1 + length2;
        if (totalLength % 2 == 1) { // ȡ����һ����ʾ��������Ԫ�ء�
            int midIndex = totalLength / 2;
            double median = getKthElement(num1, num2, midIndex + 1);    // midIndex + 1 ��ʾ�м��Ԫ�ص�������
            return median;
        } else {    // Ԫ�ظ�����ż������
            int midIndex1 = totalLength / 2 - 1, midIndex2 = totalLength / 2;
            double median = (getKthElement(num1, num2, midIndex1 + 1) + getKthElement(num1, num2, midIndex2 + 1)) / 2.0;
            return median;
        }
    }

    public int getKthElement(int[] num1, int[] num2, int k) {
        // �߽����



        // �������

        return 0;
    }
}

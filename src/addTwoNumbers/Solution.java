package addTwoNumbers;

/**
 * @author ������
 * @version 2021.2
 * @date 2022/3/16 9:30 ����
 */

// �����ListNode����Ҫ�Լ�ʵ�֣�Ȼ��ʹ��ʵ�ֵ���������еĲ�����������
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;  // �ƽڵ㣺��ʼֵΪnull�Ľڵ�
        int carry = 0;  // ��λֵ
        while (l1 != null || l2 != null) {  // ����һ������δ�ﵽĩβ����Ϊnull��
            // ��������ȼ����� != ; ?: ; =
            // n1,n2��������Ӧλ�õ�����
            int n1 = l1 != null ? l1.val : 0;   // ����Ϊ�վ͸�0ֵ�������������������ͬ��λ��
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10); // �ڵ����
            }
            carry = sum / 10;   // �����λ��
            if (l1 != null) {   // ���l1�Ľڵ㲻Ϊnullʱ����l1�Ľڵ����
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {    // �����������ڵ�����н�λ������������½ڵ㡣
            tail.next = new ListNode(carry);
        }
        return head;    // ���������ͷ�ڵ�
    }

}


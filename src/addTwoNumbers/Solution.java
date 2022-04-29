package addTwoNumbers;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/3/16 9:30 上午
 */

// 这里的ListNode类需要自己实现，然后使用实现的类调用类中的参数，方法。
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;  // 哑节点：初始值为null的节点
        int carry = 0;  // 进位值
        while (l1 != null || l2 != null) {  // 当有一个链表未达到末尾（不为null）
            // 这里的优先级是先 != ; ?: ; =
            // n1,n2是链表相应位置的数字
            int n1 = l1 != null ? l1.val : 0;   // 链表为空就赋0值，保持两个链表具有相同的位数
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10); // 节点后移
            }
            carry = sum / 10;   // 计算进位数
            if (l1 != null) {   // 如果l1的节点不为null时，将l1的节点后移
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {    // 如果最后两个节点相加有进位数，链表添加新节点。
            tail.next = new ListNode(carry);
        }
        return head;    // 返回链表的头节点
    }

}


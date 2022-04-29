package addTwoNumbers;

public class Test {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(8);
        ListNode l2 = new ListNode(4);
        l1.next = new ListNode(2);
        l2.next = new ListNode(3);
        ListNode p = new ListNode();
        p.print();
    }
}
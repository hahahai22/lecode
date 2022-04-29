package addTwoNumbers;

/**
 * @author ������
 * @version 2021.2
 * @date 2022/3/16 10:04 ����
 */
public class ListNode {
    public int val;     // �ڵ�ֵ
    public ListNode next;   // ��һ���ڵ�

    public ListNode() {
    }

    public ListNode(int val) {

        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    //print�����������鿴���
    public void print() {
        System.out.print(this.val);
        if (this.next != null) {
            System.out.print("-->");
            this.next.print();
        }
    }
}

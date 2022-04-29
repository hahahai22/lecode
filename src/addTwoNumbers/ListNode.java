package addTwoNumbers;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/3/16 10:04 上午
 */
public class ListNode {
    public int val;     // 节点值
    public ListNode next;   // 下一个节点

    public ListNode() {
    }

    public ListNode(int val) {

        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    //print方法便于最后查看结果
    public void print() {
        System.out.print(this.val);
        if (this.next != null) {
            System.out.print("-->");
            this.next.print();
        }
    }
}

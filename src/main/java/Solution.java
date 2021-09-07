
public class Solution {
    private ListNode lastNode;

    public ListNode reverseList(ListNode head) {
        reverse(head);
        return lastNode;
    }

    private ListNode reverse(ListNode head) {
        if(head == null)
            return null;
        if(head.next == null) {
            System.out.println("last node " + head.val);
            lastNode = head;
            return head;
        }

        ListNode nextNode = reverseList(head.next);
        System.out.println("nextNode.val " + nextNode.val);
        System.out.println("head.val " + head.val);
        nextNode.next = head;
        head.next = null;

        return nextNode;
    }

}

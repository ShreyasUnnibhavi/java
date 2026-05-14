
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class InsertionSortList {
    public static ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode curr = head;
        while(curr != null) {
            ListNode nextNode = curr.next;
            ListNode prev = dummy;
            while(prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }
            curr.next = prev.next;
            prev.next = curr;

            curr = nextNode;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        for(int i = 0; i < 5; i++) {
            curr.next = new ListNode();
            curr.next.val =  5 - i;
            curr = curr.next;
        }
        curr = insertionSortList(head.next);
        for(int i = 0; i < 5; i++) {
            System.out.print(curr.val + ", ");
            curr = curr.next;
        }
    }
}
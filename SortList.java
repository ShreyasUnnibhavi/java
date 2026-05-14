class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class SortList {
    public static ListNode getMidNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode mid = getMidNode(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;
        left = sortList(left);
        right = sortList(right);
        return merge(left, right);
    }
    public static ListNode merge(ListNode l, ListNode r) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(l != null && r != null) {
            if(l.val < r.val) {
                curr.next = l;
                l = l.next;
            }else {
                curr.next = r;
                r = r.next;
            }
            curr = curr.next;
        }
        if(l != null) curr.next = l;
        if(r != null) curr.next = r;
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
        curr = sortList(head.next);
        for(int i = 0; i < 5; i++) {
            System.out.print(curr.val + ", ");
            curr = curr.next;
        }
    }
}

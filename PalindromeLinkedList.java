import java.util.Stack;

public class PalindromeLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            s.push(temp.val);
            temp = temp.next;
        }

        while(head != null){
            if(s.pop() != head.val)
                return false;
            head = head.next;
        }
        return true;
    }
    public static void main(String[] args) {
        ListNode newNode = new ListNode(1);
        newNode.next = new ListNode(2);
        newNode.next.next = new ListNode(2);
        newNode.next.next.next = new ListNode(3);

        PalindromeLinkedList sol = new PalindromeLinkedList();
        System.out.println(sol.isPalindrome(newNode));
    }
}

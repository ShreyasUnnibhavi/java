public class MergeKSortedLists {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node sortedMerge(Node left, Node right){
        Node mergedLL = new Node(-1); //dummy node
        Node temp = mergedLL;       //iterating Node

        while(left != null && right != null){
            if(left.data <= right.data){
                temp.next = left;
                left = left.next;
            }else{
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        //Adding the remaining nodes in left half
        while(left != null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        //adding remaining nodes in right half
        while(right != null){
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return mergedLL.next;

    }
    public static Node mergeLists(Node arr[], int k){
        while(k != 0){
            int i = 0, j = k;
            while(i < j){
                arr[i] = sortedMerge(arr[i], arr[j]);
                i++;
                j--;
                if(i >= j)
                    k = j;
            }
        }
        return arr[0];
    }

    public static void print(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        int k = 3;
        Node arr[] = new Node[k];

        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);

        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        // arr[1].next.next.next = new Node(8);

        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);

        Node head = mergeLists(arr, k-1);
        print(head);
    }
}

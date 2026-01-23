import java.util.LinkedList;
public class MergeSortLL {
    public LinkedList<Integer> merge(LinkedList<Integer> left, LinkedList<Integer> right){
        LinkedList<Integer> sortedLL = new LinkedList<>();
        while(!left.isEmpty() && !right.isEmpty()){
            if(left.peek() < right.peek()){
                sortedLL.add(left.poll());
            }else{
                sortedLL.add(right.poll());
            }
        }

        sortedLL.addAll(left);
        sortedLL.addAll(right);

        return sortedLL;
    }
    public LinkedList<Integer> mergeSort(LinkedList<Integer> ll){
        //base case
        if(ll.size() <= 1) return ll;
        //recursion
        int mid = ll.size()/2;
        LinkedList<Integer> left = new LinkedList<>(ll.subList(0, mid));
        LinkedList<Integer> right = new LinkedList<>(ll.subList(mid, ll.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }
    public static void main(String[] args) {
        MergeSortLL sol = new MergeSortLL();
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(2);
        ll.addLast(6);
        ll.addLast(1);
        ll.addLast(9);
        ll.addLast(4);
        ll.addLast(7);
        LinkedList<Integer> sorted =  sol.mergeSort(ll);
        System.out.println(sorted);
    }
}

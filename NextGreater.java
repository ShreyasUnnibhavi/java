import java.util.Stack;
//the time complexity is O(n) and the space complexity O(n)
public class NextGreater {
    public static void findNextGreater(int arr[], int[] nextGreater){
        Stack<Integer> s = new Stack<>();
        //start from the end of the array for easy approach
        for(int i = arr.length - 1; i >= 0; i--){
            int curr = arr[i];

            //remove the top if it is lesser than or equal to current element
            while(!s.isEmpty() && curr >= arr[s.peek()]) //curr<= arr[s.peek()] gives the next smaller element array
                s.pop();    //eventually every element will be popped

            //assign nextGreater to -1 if the stack contains nothing, implies theres no bigger element than the current
            if(s.isEmpty())
                nextGreater[i] = -1;
            else
                nextGreater[i] = arr[s.peek()];

            //every checked element to be pushed into the stack
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 8, 0, 1, 6};
        int nextGreater[] = new int[arr.length];
        findNextGreater(arr, nextGreater);
        for(int i = 0; i < nextGreater.length; i++){
            System.out.print(nextGreater[i] + " ");
        }
    }
}

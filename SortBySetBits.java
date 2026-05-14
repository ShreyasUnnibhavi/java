import java.util.Arrays;
public class SortBySetBits {
    public static int[] sortByBits(int[] arr) {
        int n = arr.length;
        Integer[] boxedArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            boxedArray[i] = arr[i];
        }
        Arrays.sort(boxedArray, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            
            if(countA == countB) {
                return Integer.compare(a, b);
            }
            return Integer.compare(countA, countB);
        });
        for (int i = 0; i < n; i++) {
            arr[i] = boxedArray[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }
}

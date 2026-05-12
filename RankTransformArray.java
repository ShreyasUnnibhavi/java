public class RankTransformArray {
    public static int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if(n == 0)  return new int[0];
        int[] sorted = arr.clone();
        java.util.Arrays.sort(sorted);
        int uniqueElement = 1;
        for(int i = 1; i < n; i++) {
            if(sorted[i] != sorted[i - 1]) {
                sorted[uniqueElement] = sorted[i];
                uniqueElement++;
            }
        }
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            int index = java.util.Arrays.binarySearch(sorted, 0, uniqueElement, arr[i]);
            result[i] = index + 1;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        System.out.println(java.util.Arrays.toString(arrayRankTransform(arr)));
    }
}

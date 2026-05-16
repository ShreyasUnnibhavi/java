public class NextGreaterIII {
    public static int nextGreaterElement(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        int pivot = digits.length - 2;
        while(pivot >= 0 && digits[pivot] >= digits[pivot + 1]) {
            pivot--;
        }   
        if(pivot < 0) return -1;
        int j = digits.length - 1;
        while(digits[j] <= digits[pivot]) {
            j--;
        }
        swap(digits, pivot, j);
        reverse(digits, pivot + 1, digits.length - 1);
        long res = Long.parseLong(new String(digits));
        return res > Integer.MAX_VALUE ? -1 : (int)(res);
    }
    public static void swap(char[] digits, int i, int j) {
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }
    public static void reverse(char[] digits, int i, int j) {
        while(i < j) {
            swap(digits, i, j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int n = 12;
        System.out.println(nextGreaterElement(n));
    }
}

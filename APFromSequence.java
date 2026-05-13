public class APFromSequence {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : arr) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        if(max == min) return true;
        if((max - min) % (n - 1) != 0) return false;
        int d = (max - min) / (n - 1);
        boolean[] seen = new boolean[n];
        for(int num : arr) {
            if((num - min) % d != 0) return false;
            int step = (num - min) / d;
            if(step >= n || seen[step]) return false;
            seen[step] = true;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 11, 9};
        System.out.println(canMakeArithmeticProgression(arr));
    }
}
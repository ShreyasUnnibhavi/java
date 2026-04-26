import java.util.Scanner;
public class FoodStamps {
    public static int calculateSum(long mid, int[] v, int[] d) {
        int sum = 0;
        for(int i = 0; i < v.length; i++) {
            if(v[i] >= mid) {
                long k = (v[i] - mid) / d[i] + 1;
                sum += k * (2L * v[i] - (k - 1L) * d[i]) / 2L;
            }
        }
        return sum;
    }
    public static int countMeals(long mid, int[] v, int[] d) {
        int count = 0;
        for(int i = 0; i < v.length; i++) {
            if(v[i] >= mid) 
                count += (v[i] - mid) / d[i] + 1;
        }
        return count;
    }
    public static long maxTastePoints(int n, long m, int[] v, int[] d) {
        int maxV = 0;
        for(int val : v) 
            maxV = Math.max(maxV, val);

        if(countMeals(1, v, d) <= m) {
            return calculateSum(1, v, d);
        }

        long low = 1;
        long high = maxV;
        long threshold = 1;
        while(low <= high) {
            long mid = low + (high - low)/2;
            if(countMeals(mid, v, d) >= m) {
                threshold = mid;
                low = mid + 1;
            }else
                high = mid - 1;
        }

        long totalSum = calculateSum(threshold + 1, v, d);
        long itemsTaken = countMeals(threshold + 1, v, d);
        long remainingM = m - itemsTaken;
        totalSum += remainingM * threshold;

        return totalSum;

    }
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of food types");
        int n = scanner.nextInt();
        System.out.println("Enter the maximum food tries");
        long m = scanner.nextLong(); 

        
        int[] v = new int[n];
        int[] d = new int[n];

        System.out.println("Enter " + n + " v's");
        for (int i = 0; i < n; i++) 
            v[i] = scanner.nextInt();
        System.out.println("Enter " + n + " d's");
        for (int i = 0; i < n; i++) 
            d[i] = scanner.nextInt();
        

        long result = maxTastePoints(n, m, v, d);
        System.out.println(result);
        
        scanner.close();
    
    }
}

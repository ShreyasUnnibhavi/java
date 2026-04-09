public class rainwater {
    public static void calculateWater(int[] buildings) {
        int n = buildings.length;
        int[] maxLeft = new int[n];
        maxLeft[0] = buildings[0];
        for(int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(buildings[i], maxLeft[i-1]); 
        }

        int[] maxRight = new int[n];
        maxRight[n-1] = buildings[n-1];
        for(int i = n-2; i >= 0; i--) {
            maxRight[i] = Math.max(buildings[i], maxRight[i+1]);
        }

        int sum = 0;
        for(int i = 0; i < n; i++) {
            int minWall = Math.min(maxLeft[i], maxRight[i]);
            if(minWall > buildings[i])
                sum = sum + (minWall - buildings[i]);
        }

        System.out.println("Total water collected: " + sum);
    }
    public static void main(String[] args) {
        int buildings[] = {4, 2, 0, 3, 2, 5};
        calculateWater(buildings);
    }
}
// import java.util.*;
public class rainwater {
    public static void calculateWater(int buildings[]){
        int n=buildings.length;
        //maxLeft calculation
        int maxLeft[] = new int[n];
        maxLeft[0] = buildings[0] ;
        for(int i=1; i<n; i++){
            maxLeft[i] = Math.max(buildings[i],maxLeft[i-1]);
            // System.out.print(maxLeft[i]);
        }

        //maxRight calculation
        int maxRight[] = new int[n];
        maxRight[n-1] = buildings[n-1] ;
        for(int i=n-2; i>=0; i--){
            maxRight[i] = Math.max(buildings[i],maxRight[i+1]);
            // System.out.print(maxRight[i]);
        }
        int sum=0;
        for(int i=0; i<buildings.length; i++){
            int minHeight = Math.min(maxLeft[i],maxRight[i]);
            int water = minHeight - buildings[i];
            // System.out.println(water);
            sum += water;
        }System.out.println("Total water collected: "+sum);
    }
    public static void main(String args[]){
        int buildings[] = {4, 2, 0, 3, 2, 5};
        calculateWater(buildings);
    }
}

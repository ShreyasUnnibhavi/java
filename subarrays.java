// print all the subarrays of an array, also calculate the sum of each subarray
// and find the minimum and maximum value of all the sums
public class subarrays {
    public static void printSubarrays(int numbers[]){
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                int sum = 0;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]);
                    sum = sum + numbers[k];
                }
                if(sum>min)min = sum;
                if(sum<max)max = sum;
                System.out.print(" = " +sum + "\n");
            }
            System.out.println();
        }
        System.out.print("maximum= "+max+" Minimum= "+min);
    }
    public static void prefixMethod(int numbers[]){
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for(int i=1; i<numbers.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                int prefixSum = 0;
                prefixSum = start==0? prefix[end]: prefix[end] - prefix[start-1];
                if(prefixSum>min)min = prefixSum;
                if(prefixSum<max)max = prefixSum;
                System.out.print(" = " +prefixSum + "\n");
            }
            System.out.println();
        }
        System.out.print("maximum= "+max+" Minimum= "+min);
    }
    public static void kadenes(int numbers[]){
        int currSum = 0;
        int count = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < 0){
                count++;
            }
        }
        for(int i=0; i<numbers.length; i++){
            if(count == numbers.length){
                if(numbers[i] > maxSum){
                    maxSum = numbers[i];
                }
            }else{
                currSum = currSum + numbers[i];
                if(currSum < 0){
                    currSum = 0;
                }
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }    
        }
        System.out.print("maximum: "+ maxSum);
    }
    public static void main(String args[]){
        int numbers[] = {-9, -2, -6, -1, -3};
        printSubarrays(numbers);
        // prefixMethod(numbers);
        // kadenes(numbers);
    }
}

public class subArraysPractice {
    public static void makeSubArrays(int array[]){
        for(int i = 0; i < array.length; i++){
            for(int j = i ; j < array.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(array[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
    // function to calculate the sum of ech sub array and the max and min value among them
    public static void sumSubArray(int array[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            for(int j = i ; j < array.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    System.out.print(array[k] + " ");
                    sum = sum + array[k];
                }
                if(sum > max){
                    max = sum;
                }
                if(sum < min){
                    min = sum;
                }
                System.out.println(".....sum: " + sum);
            }
            System.out.println();
        }
        System.out.print("Minimum sum: " + min + "\nMaximum sum: " + max);
    }

    //function to calculate maximum sum of any subarray in a given array using kadane's algorithm
    public static void kadanes(int array[]){
        int curSum = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                count++;
            }
        }
        for(int i = 0; i < array.length; i++){
            if(count == array.length){
                if(array[i] > max){
                    max = array[i];
                }
            }else{
                curSum = curSum + array[i];
                if(curSum < 0){
                    max = 0;
                }else if(curSum > max){
                    max = curSum;
                }
            }
        }
        System.out.print("Maximum sum: " + max);
    }
    
    public static void main(String args[]){
        int array[] = {2,4,6,8,10};
        // makeSubArrays(array);
        // sumSubArray(array);
        kadanes(array);
    }
}

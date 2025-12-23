// public class tripletSumZero {
//     public static void generateTriplets(int numbers[]){
//         for(int i=0; i<numbers.length; i++){
//             for(int j=i+1; j<numbers.length; j++){
//                 for(int k=j+1; k<numbers.length; k++){
//                     if(numbers[i] + numbers[j] + numbers[k] == 0){
//                         if(numbers[i] != numbers[j] && numbers[i] != numbers[k] && numbers[j] != numbers[k]){
//                             System.out.print("[ " + numbers[i] + ", " + numbers[j] + ", "+ numbers[k] + " ]");
//                         }
//                     }
//                 }
//                 System.out.println();
//             }
//         }
//     }
//     public static void main(String args[]){
//         int numbers[] = {-1, 0, 1, 2, -1, -4};
//         generateTriplets(numbers);
//     }
// }

public class tripletSumZero{
    public static void generateTriplets(int nums[]){
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    if((nums[i] + nums[j] + nums[k] == 0) && nums[i] != nums[j] && nums[j] != nums[k] && nums[i] != nums[k]){
                        System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        int nums[] = {-1, 0, 1, 2, -1, -4};
        generateTriplets(nums);
    }
}
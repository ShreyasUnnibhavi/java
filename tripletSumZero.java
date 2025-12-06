public class tripletSumZero {
    public static void generateTriplets(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                for(int k=j+1; k<numbers.length; k++){
                    if(numbers[i] + numbers[j] + numbers[k] == 0){
                        if(numbers[i] != numbers[j] && numbers[i] != numbers[k] && numbers[j] != numbers[k]){
                            System.out.print("[ " + numbers[i] + ", " + numbers[j] + ", "+ numbers[k] + " ]");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String args[]){
        int numbers[] = {-1, 0, 1, 2, -1, -4};
        generateTriplets(numbers);
    }
}

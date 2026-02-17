public class StringPermutations{
    public static void swap(char str[], int i, int j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
    public static void printPermutations(char str[], int fi, int i){
        //& Base case
        if(fi == str.length-1){
            System.out.println(str);
            return;
        }

        //& Recursion
        for(i = fi; i < str.length; i++){
            swap(str, fi, i);
            printPermutations(str, fi+1, i);
            swap(str, fi, i);
        }
    }
    public static void permutations(String str, String ans){
        //! Base case
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        //! Recursion
        for(int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1, str.length());
            permutations(newStr, ans + curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        // printPermutations(str.toCharArray(), 0, 0);
        permutations(str, "");
    }
}
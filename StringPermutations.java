public class StringPermutations{
    public static void swap(char str[], int i, int j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
    public static void printPermutations(char str[], int fi, int i){
        if(fi == str.length-1){
            System.out.println(str);
            return;
        }
        for(i = fi; i < str.length; i++){
            swap(str, fi, i);
            printPermutations(str, fi+1, i);
            swap(str, fi, i);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str.toCharArray(), 0, 0);
    }
}
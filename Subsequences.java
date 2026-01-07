public class Subsequences {
    public static void printSubsequences(String str, int i, String current){
        if(i == str.length()) {
            System.out.println(current);
            return;
        }
        printSubsequences(str, i+1, current + str.charAt(i));
        printSubsequences(str, i+1, current);
    }
    public static void main(String[] args) {
        printSubsequences("abc", 0, "");
    }
}

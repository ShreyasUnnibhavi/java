public class Subsequences {
    public static void printSubsequences(String str, int i, String curr) {
        //! Base case
        if(i == str.length()){
            if(curr == "")
                System.out.println("Empty string");
            System.out.println(curr);
            return;
        }
        //! Recursion
        printSubsequences(str, i+1, curr + str.charAt(i)); //? Include
        printSubsequences(str, i+1, curr);
    }
    public static void main(String[] args) {
        printSubsequences("abc", 0, "");
    }
}

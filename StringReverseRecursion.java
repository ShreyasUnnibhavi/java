public class StringReverseRecursion {
    public static String reverse(String str) {
        //! Base case
        if(str == null || str.length() <= 1) 
            return str;
        //! Recursion
        String reversedString = reverse(str.substring(1));
        return reversedString + str.charAt(0);
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverse(str));
    }
}

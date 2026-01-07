public class StringReverseRecursion {
    public static String reverse(String str){
        if(str == null || str.length() <= 1){
            return str;
        }
        String reversedSubstring = reverse(str.substring(1));
        return reversedSubstring + str.charAt(0);
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverse(str));
    }
}

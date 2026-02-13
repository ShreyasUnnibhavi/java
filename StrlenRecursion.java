public class StrlenRecursion {
    public static int findStrlen(String str) {
        //^ Base case
        if(str.length() == 0)
            return 0;
        //^ Recursion
        return findStrlen(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        System.out.println(findStrlen("abcde"));
    }
}

public class StrlenRecursion {
    public static int findStrlen(String str){
        if(str.length() == 0) return 0;
        return findStrlen(str.substring(1)) + 1 ;
    }
    public static void main(String[] args) {
        System.out.println(findStrlen("abcde"));
    }
}

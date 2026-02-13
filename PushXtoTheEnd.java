public class PushXtoTheEnd {
    public static String push(String str, char x) {
        //& Base case
        if(str.length() == 0) 
            return "";
        //& recursion
        char curr = str.charAt(0);
        String res = push(str.substring(1), x);
        if(str.charAt(0) == x)
            return res + curr;
        else
            return curr + res;
    }
    public static void main(String[] args) {
        System.out.println(push("axbxcxd",'x'));
    }
}

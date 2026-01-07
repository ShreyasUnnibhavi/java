public class PushXtoTheEnd {
    public static String push(String str, char x) {
        if(str.isEmpty()) return "";
        char current = str.charAt(0);
        String res = push(str.substring(1), x);
        if(str.charAt(0) == x){
            return res + current;
        }else{
            return current + res;
        }
    }
    public static void main(String[] args) {
        System.out.println(push("axbxcxd",'x'));
    }
}

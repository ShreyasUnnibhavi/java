public class BinaryStringsProblem {
    public static void generateStrings(int n, int lastPlace, String str){
        if(n == 0) {
            System.out.println(str);
            return;
        }
        generateStrings(n-1,0,str+"0");
        if(lastPlace == 0){
            generateStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        int n = 3;
        generateStrings(n,0,"");
    }
}

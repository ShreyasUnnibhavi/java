public class SwapWithoutTemp {
    public static void main(String args[]){
        int a = -5, b = -9;
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println(a + " \n" + b);
    }
}

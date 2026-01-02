public class ClearLastIBits {
    public static void main(String args[]){
        int num = 15;
        int i = 2;
        System.out.print(num & (~0 << i));
    }
}

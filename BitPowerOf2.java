public class BitPowerOf2 {
    public static void main(String args[]){
        int num = 16;
        System.out.println((num & (num-1)) == 0);
    }
}

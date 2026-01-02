public class ClearRangeOfBits {
    public static void main(String args[]){
        int num = 31;
        int si = 1, ei = 3;
        int bitmask = (~0 << ei + 1) | ~(~0 << si);
        System.out.print((num & bitmask));
    }
}

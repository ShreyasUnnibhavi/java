public class bitManipulation {
    public static void getIthBit(int num, int i){
        int bitmask = 1<<i;
        if((num & bitmask) == 0){System.out.println(i + "th bit= 0");}
        else System.out.println(i + "th bit= 1");
    }
    public static int setIthBit(int n, int i){
        int bitmask = 1<<i ;
        return n | bitmask ;
    }
    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i) ;
        return n & bitmask ;
    }
    public static int clearLastIBits(int n, int i){
        int bitmask = (-1)<<i;
        return n & bitmask ;
    }
    public static int clearRangeOfBits(int n, int si, int ei){
        int a = (~0)<<ei+1;     //  1111 1111
        int b = (1<<si) - 1;    //  1110 0001
        int bitmask = a | b;    // -------------
        return n & bitmask;     //  1110 0001
    }
    public static boolean checkPowerOf2(int n){
        int res = n & n-1;
        if(res != 0) return false;
        else return true;
    }
    public static void main(String args[]){
        // getIthBit(7, 2);
        // System.out.println(clearIthBit(10,3));
        // System.out.println(clearLastIBits(15,2));
        // System.out.println(clearRangeOfBits(10,2,4));
        System.out.print(checkPowerOf2(15));
    }
}

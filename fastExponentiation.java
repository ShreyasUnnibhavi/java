public class fastExponentiation {
    public static void compute(int n, int i){
        int ans = 1;
        while(i>0){
            if((i & 1) != 0){
                ans = n * ans ;
            }
            n = n * n;
            i = i >> 1;
        }
        System.out.print(ans);
    }
    public static void main(String args[]){
        compute(5,3);
    }
}

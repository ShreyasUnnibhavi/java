public class BitAdd1 {
    public static void main(String args[]) {
        int n = -8;

        // 1. The bitwise NOT operator (~) flips all bits.
        //    ~n + n = -1       //? ~(-8) + (-8) = -1  
        //    ~n = (-n) - 1     //? ~(-8) = 8 - 1 = 7
        //    So, ~(-8) becomes 7.
        //
        // 2. We then apply the negative sign (-) to that result.
        //    -(-n - 1) simplifies to: n + 1
        //
        // Result: - (7) = -7
        System.out.println(-~n); 
    }
}
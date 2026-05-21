public class FiboFormula {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.println(findFibonacci(i));
        }
    }
    public static long findFibonacci(int n) {
        double goldernRatio = (1 + Math.sqrt(5)) / 2;
        double psi = (1 - Math.sqrt(5)) / 2;
        double numerator = Math.pow(goldernRatio, n) - Math.pow(psi, n);
        return Math.round(numerator / Math.sqrt(5));
    }
}

public class numberReverse{
    public static void main(String args[]){
        int num = 23415;
        int rev = 0;
        while (num > 0){
            int temp = num % 10;
            rev = rev*10 + temp;
            num = num / 10;
        }
        System.out.print(rev);
    }
}

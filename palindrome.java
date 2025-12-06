public class palindrome {
    public static boolean palindromeCheck(int num){
        int temp = num;
        int sum = 0;
        while(num > 0){
            int f = num % 10 ;
            sum = sum * 10 + f;
            num = num / 10;
        }
        return temp == sum;
    }
    public static void main(String args[]){
        int num = 324423;
        boolean check = palindromeCheck(num);
        System.out.print(check);
    }
}


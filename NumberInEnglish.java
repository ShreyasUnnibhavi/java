public class NumberInEnglish {
    static String digits[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    public static void english(int num){
        if(num == 0) {
            return;
        }
        english(num/10);
        System.out.print(digits[num%10] + " ");
        
    }
    public static void main(String[] args) {
        english(1234);
    }
}

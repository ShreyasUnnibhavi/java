import java.util.*;

public class lowercaseVowels {
    public static void countVowels(String str){
        int count = 0;
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.print("Total vowels: "+count);
    }
    public static void main(String args[]){
        System.out.println("Enter a string");
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            countVowels(str);
        }
    }
}

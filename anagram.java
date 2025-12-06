import java.util.*;
public class anagram{
    public static void checkForAnagram(String str1,String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        if(Arrays.equals(charArr1,charArr2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter string2: ");
        String str2 = sc.nextLine();
        checkForAnagram(str1,str2);
    }
}

import java.util.*;
public class anagram{
    public static boolean checkForAnagram(String str1,String str2){
        if(str1.length() != str2.length())
            return false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        for(int i = 0; i < charArray1.length; i++){
            if(charArray1[i] != charArray2[i])
                return false;
        }

        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter string2: ");
        String str2 = sc.nextLine();
        System.out.println(checkForAnagram(str1,str2));
    }
}

public class HalvesAlike {
    public static boolean halvesAreAlike(String s) {
        int n = s.length();
        String s1 = s.substring(0, n / 2);
        String s2 = s.substring(n/2);
        return numberOfVowels(s1) == numberOfVowels(s2);
    }
    public static int numberOfVowels(String s) { 
        int num = 0;
        for(char c : s.toCharArray()) {
            if(c == 65 || c == 69 || c == 73 || c == 79 || c == 85 || 
            c == 97 || c == 101 || c == 105 || c == 111 || c == 117) num++;
        }
        return num;
    }
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }
}

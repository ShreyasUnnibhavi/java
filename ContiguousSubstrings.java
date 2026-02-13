public class ContiguousSubstrings {
    public static int countSubstrings(String str, int i){
        //!Base case
        if(i == str.length()) 
            return 0;
        //!Recursion
        int count = 0;
        for(int j = i; j < str.length(); j++) {
            if(str.charAt(i) == str.charAt(j))
                count++;
        }
        return count + countSubstrings(str, i+1);
    }
    public static void main(String[] args) {
        String str = "abcab";
        System.out.println(countSubstrings(str, 0));
    }
}

public class DuplicatesInString {
    public static String removeDuplicates(String str, boolean characters[], StringBuilder sb, int i) {
        //^Base case
        if(i >= str.length())
            return sb.toString();
        //^Recursion
        char curr = str.charAt(i);
        if(characters[curr - 'a'] == false) {
            characters[curr - 'a'] = true;
            sb.append(curr);
        }

        return removeDuplicates(str, characters, sb, i+1);
    }
    public static void main(String[] args) {
        String str = "Shreyas";
        String str1 = str.toLowerCase();
        System.out.println(removeDuplicates(str1, new boolean[26], new StringBuilder(), 0));
    }
}

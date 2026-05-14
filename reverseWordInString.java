public class reverseWordInString {
    public static String reverseWords(String s) {
        char[] array = s.toCharArray();
        int spaceIdx = 0;
        int i = 0;
        while(i < s.length()) {
            if(s.charAt(i) == ' ') {
                reverse(array, spaceIdx, i - 1);
                spaceIdx = i + 1;
            }
            i++;
        }   
        reverse(array, spaceIdx, i - 1);
        return new String(array);
    }
    public static void reverse(char[] array, int i, int j) {
        while(i < j) {
            char temp = array[i];
            array[i++] = array[j];
            array[j--] = temp;
        }
    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}

public class Reverseprefix {
    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index == -1) return word;
        char[] arr = word.toCharArray();
        int left = 0;
        int right = index;
        while(left < right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }
}

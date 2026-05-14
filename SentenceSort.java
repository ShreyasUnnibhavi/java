public class SentenceSort {
    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sentence = new String[words.length];
        for(String word : words) {
            int pos = word.charAt(word.length() - 1) - '1';
            sentence[pos] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", sentence);
    }
    public static void main(String[] args) {
        String sentence = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(sentence));
    }
}

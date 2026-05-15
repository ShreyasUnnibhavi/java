public class SentenceSimilarity {
    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        if(s1.length < s2.length) return areSentencesSimilar(sentence2, sentence1);
        int n1 = s1.length;
        int n2 = s2.length;
        int left = 0;
        while(left < n2 && s1[left].equals(s2[left])) {
            left++;
        }

        int r1 = n1 - 1;
        int r2 = n2 - 1;
        while(r2 >= left && s1[r1].equals(s2[r2])) {
            r1--;
            r2--;
        }
        return left > r2;
    }
    public static void main(String[] args) {
        String sentence1 = "My name is Haley";
        String sentence2 = "My Haley";
        System.out.println(areSentencesSimilar(sentence1, sentence2));
    }
}

public class KeypadCombo {
    public static String keypad[] = {".", "abc" , "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printCombo(String str, int index, String combo) {
        //* Base case
        if(combo.length() == str.length()) {
            System.out.println(combo);
            return;
        }
        
        //* Recursive logic
        char currChar = str.charAt(index);
        String map = keypad[currChar - '0'];
        for(int i = 0; i < map.length(); i++) {
            printCombo(str, index + 1, combo + map.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        printCombo(str, 0, "");
    }
}

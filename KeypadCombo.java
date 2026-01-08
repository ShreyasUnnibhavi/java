public class KeypadCombo {
    public static String keypad[] = {".", "abc" , "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printCombo(String str, int index, String combo){
        if(index == str.length()){
            System.out.println(combo);
            return;
        }
        char currChar = str.charAt(index);
        String mapping = keypad[currChar - '0'];
        for(int i = 0; i <mapping.length(); i++){
            printCombo(str, index+1, combo + mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        printCombo(str, 0, "");
    }
}

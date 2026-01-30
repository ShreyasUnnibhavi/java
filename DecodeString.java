import java.util.Stack;

public class DecodeString {
    public static String decodeString(String str){
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currStr = new StringBuilder();
        int k = 0;

        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                k = k * 10 + (ch - '0'); 
            }else if(ch == '['){
                numStack.push(k);
                strStack.push(currStr);

                k = 0;
                currStr = new StringBuilder("");
            }else if(ch == ']'){
                StringBuilder decoded = strStack.pop();
                int count = numStack.pop();

                while(count-- > 0){
                    decoded.append(currStr);
                }
                currStr = decoded;
            }else{
                currStr.append(ch);
            }
        }
        return currStr.toString();
    }
    public static void main(String[] args) {
        String str = "3[ab4[c]]d";
        System.out.println(decodeString(str));
    }
}

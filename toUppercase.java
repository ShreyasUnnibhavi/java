public class toUppercase {
    public static void convertToUppercase(String text){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(text.charAt(0));
        sb.append(ch);
        for(int i=1; i<text.length(); i++){
            if(text.charAt(i) == ' ' && i < text.length()-1){
                sb.append(text.charAt(i));
                i++;
                sb.append(Character.toUpperCase(text.charAt(i)));
            }else{
                sb.append(text.charAt(i));
            }
        }
        System.out.print(sb);
    }
    public static void main(String args[]){
        String text = "hi, my name is shreyas ";
        convertToUppercase(text);
    }
}

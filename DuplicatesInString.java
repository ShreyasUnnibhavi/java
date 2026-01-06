public class DuplicatesInString {
    public static StringBuilder uniqueString(String str, StringBuilder sb, int i, boolean track[]){
        if(i >= str.length()){
            return sb;
        }
        if(track[(int)str.charAt(i) - 'a'] == false){  //97 can also be written instead of 'a' (ASCII value of 'a' is 97)
            track[(int)str.charAt(i) - 'a'] = true;
            sb.append(str.charAt(i));
        }
        return uniqueString(str, sb, i+1, track);
    }
    public static void main(String[] args) {
        String str = "apnacollege";
        System.out.println(uniqueString(str,new StringBuilder(""),0,new boolean[26]));
    }
}

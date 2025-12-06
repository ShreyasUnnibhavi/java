public class largestString {
    public static void findLargest(String str[]){
        String largest = str[0];
        for(int i=1; i<str.length; i++){
            if(str[i].compareTo(largest) > 0){
                largest = str[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String args[]){
        String str[] = {"apple", "mango", "orange"};
        findLargest(str);
        // System.out.println(str[0].concat(str[1]));
    }
    
}

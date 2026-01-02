public class GetIthBit {
    public static void main(String args[]){
        int num = 5;
        int i = 2;
        System.out.print((num>>i) & 1);
    }
}

public class FriendsPairingProblem {
    public static int pair(int n){
        if(n == 1 || n == 2){
            return n;
        }
        int fnm1 = pair(n-1); //first person staying single
        int fnm2 = (n-1)*pair(n-2); //first person pairing with anyone out of the remaining 
        return fnm1 + fnm2;
    }
    public static void main(String[] args) {
        System.out.println(pair(1));
    }
}

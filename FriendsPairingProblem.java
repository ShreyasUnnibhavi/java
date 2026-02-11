public class FriendsPairingProblem {
    public static int pair(int n){
        //^ Base case
        if(n == 1 || n == 2) {
            return n;
        }

        //^ Recursion
        int fnm1 = pair(n-1);           //& One friend decides to stay single, then we hav to solve for remaining n-1 firends
        int fnm2 = (n-1) * pair(n-2);   //& One friend decides to pair up (can pair with remaining n-1) * solve for the remaining friends excpet these two (n-2)

        return fnm1 + fnm2;
    }
    public static void main(String[] args) {
        System.out.println(pair(3));
    }
}

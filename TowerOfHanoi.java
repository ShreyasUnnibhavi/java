public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String s, String h, String d) {
        //? s = source
        //? h = helper
        //? d = destination
        //^ Base case
        if(n == 1){
            System.out.println("transfer disk " + n + " from " + s + " to " + d);
            return;
        }
        //^ Recursion
        towerOfHanoi(n-1, s, d, h);
        System.out.println("transfer disks " + n + " from " + s + " to " + d);
        towerOfHanoi(n-1, h, s, d);

    }
    public static void main(String[] args) {
        int n = 4;  //Number of disks
        towerOfHanoi(n, "A", "B", "C");
    }
}

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String s, String h, String d) {
        //? s = source
        //? h = helper
        //? d = destination
        //^ Base case
        if(n == 1){
            System.out.println(s + " -> " + d);
            return;
        }
        //^ Recursion
        towerOfHanoi(n-1, s, d, h);
        towerOfHanoi(1, s, h, d);
        towerOfHanoi(n-1, h, s, d);

    }
    public static void main(String[] args) {
        int n = 3;  //Number of disks
        towerOfHanoi(n, "A", "B", "C");
    }
}

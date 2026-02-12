public class IndexesOfKey {
    public static void indexes(int nums[], int key, int i) {
        //! Base case
        if(i == nums.length)
            return;
        //! Recursion
        if(nums[i] == key) 
            System.out.println(i);
        indexes(nums, key, i+1);
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,3,6,4,3};
        indexes(array, 3, 0);
    }
}

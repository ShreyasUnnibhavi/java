public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int count1 = m - 1, count2 = n - 1;
        while(count1 >= 0 || count2 >= 0){
            if(count2 < 0){
                nums1[count1] = nums1[count1];
                count1--;
            }else if(count1 < 0){
                nums1[count2] = nums2[count2];
                count2--;
            }else if(nums1[count1] > nums2[count2]){
                nums1[count1 + count2 + 1] = nums1[count1];
                count1--;
            }else if(nums1[count1] <= nums2[count2]){
                nums1[count1 + count2 + 1] = nums2[count2];
                count2--;
            }
        }
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0}, m = 3, nums2[] = {2,5,6}, n = 3;
        merge(nums1,m,nums2,n);
        for(int i = 0; i < nums1.length; i++){
            System.out.print(nums1[i] + " ");
        }
    }
}

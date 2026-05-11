public class AllocateMinPages {
    //12, 34, 67, 90
    public static boolean canAllocate(int[] pages, int limit, int k) {
        int students = 1;
        int currSum = 0;
        for(int book : pages) {
            if(currSum + book > limit) {
                students++;
                currSum = book;
            }else {
                currSum += book;
            }
        }
        return students <= k;
    }
    public static int allocateMinPages(int[] pages, int k) {
        int n = pages.length;
        if(k > n) return -1;
        int max = 0;
        int sum = 0;
        for(int book : pages) {
            max = Math.max(max, book);
            sum += book;
        }
        int start = max; //! Lower bound
        int end = sum; //& Upper bound
        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(canAllocate(pages, mid, k)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] pages = {12, 34, 67, 90};
        int k = 5;
        System.out.println(allocateMinPages(pages, k));
    }
}
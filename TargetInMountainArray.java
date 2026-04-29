public class TargetInMountainArray {
    public static int findPeak(int[] mountainArr, int start, int end) {
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(mountainArr[mid] > mountainArr[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        return end;
    }
    public static int binarySearch(int[] mountainArr, int start, int end, int target, boolean isAscending) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = mountainArr[mid];
            if(midVal == target) return mid;

            if(isAscending) {
                if(midVal > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }else {
                if(midVal < target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }    
        return -1;
    }
    public static int findInMountainArray(int target, int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length - 1;
        int peakIdx = findPeak(mountainArr, start, end);
        int firstHalf = binarySearch(mountainArr, 0, peakIdx, target, true);
        if(firstHalf != -1)
            return firstHalf;
        return binarySearch(mountainArr, peakIdx, end, target, false);
    }
    public static void main(String[] args) {
        int[] mountainArr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(findInMountainArray(target, mountainArr));
    }
}

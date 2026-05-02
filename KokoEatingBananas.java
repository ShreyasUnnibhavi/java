public class KokoEatingBananas {
    public static boolean canFinish(int[] piles, long speed, int h) {
        int totalHours = 0;
        for(int pile : piles) {
            totalHours += (pile + speed - 1) / speed;
            if(totalHours > h) return false;
        }
        return totalHours <= h;
    }
    public static int minEatingSpeed(int[] piles, int h) {
        long start = 1;
        long end = 0;
        for(int pile : piles) {
            if(pile > end) end = pile;
        }
        int ans = (int) end;
        
        while(start <= end) {
            long mid = start + (end - start) / 2;
            if(canFinish(piles, mid, h)) {
                ans = (int)mid;
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }
}

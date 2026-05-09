public class ShipWithinDays {
    public static int shipWithinDays(int[] weights, int days) {
        int start = 0, end = 0;
        for(int w : weights) {
            if(w > start) start = w;
            end += w;
        }
        while(start < end) {
            int mid = start + (end - start) / 2, need = 1, curr = 0;
            for(int w : weights) {
                if(curr + w > mid) {
                    need++;
                    curr = 0;
                }
                curr += w;
            }
            if(need > days) start = mid + 1;
            else end = mid;
        }
        return start;
    }
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }
}

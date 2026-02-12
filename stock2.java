public class stock2 {
    public static void sellForMaxProfit(int stocks[]){
        int bp = stocks[0];
        int maxProfit = 0;
        for(int i = 1; i < stocks.length; i++) {
            maxProfit = Math.max(maxProfit, stocks[i] - bp);
            if(stocks[i] < bp) {
                bp = stocks[i];
            }
        }
        maxProfit = maxProfit > 0 ? maxProfit : 0;
        System.out.println(maxProfit);
    }
    public static void main(String args[]){
        int stocks[] = {2,3,1,5,3,5,8,9};
        sellForMaxProfit(stocks);
    }
}

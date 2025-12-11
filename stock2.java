public class stock2 {
    public static void sellForMaxProfit(int stocks[]){
        int maxProfit = 0;
        int diff;
        for(int i = 0; i <= stocks.length; i++){
            for(int j = i+1; j < stocks.length; j++){
                diff = stocks[j] - stocks[i];
                if(diff > maxProfit){
                    maxProfit = diff;
                }
            }
        }
        if(maxProfit < 0){
            System.out.print("0");
        }else{
            System.out.print(maxProfit);
        }
    }
    public static void main(String args[]){
        int stocks[] = {2,3,1,5,3,5,8,9};
        sellForMaxProfit(stocks);
    }
}

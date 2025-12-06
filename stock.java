public class stock {
    public static void makeProfit(int prices[]){
        int bp = prices[0]; //Buying price
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if((prices[i] - bp) > maxProfit){
                maxProfit = prices[i] - bp;
            }
            if(prices[i] < bp){
                bp = prices[i];
            }
        }
        if(maxProfit <= 0){
            System.out.print("0");
        }else
            System.out.print(maxProfit);
    }
    public static void main(String args[]){
        int prices[] = {2,3,1,5,3,5,8,9};
        makeProfit(prices);
    }
}

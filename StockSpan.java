import java.util.Stack;
public class StockSpan {
    public static int[] solution(int[] prices, int[] span){
        Stack<Integer> s = new Stack<>();
        s.push(0);
        span[0] = 1;
        for(int i = 1; i < prices.length; i++){
            //pop the index if the prices is larger than the prices at the index in the stack
            while(!s.isEmpty() && prices[i] >= prices[s.peek()]){
                s.pop();
            }

            //if the last element is greatest element in the prices array
            if(s.isEmpty()){
                span[i] = i + 1;
            }else{      //current index - index of the just largest price backward
                span[i] = i - s.peek();
            }

            //Always push the index into the stack
            s.push(i);
        }
        return span;
    }
    public static void main(String[] args) {
        int prices[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[prices.length];
        span = solution(prices, span);
        for(int i = 0; i < span.length; i++){
            System.out.print(span[i] + " ");
        }
    }
}

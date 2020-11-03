public class StocksMaxProfit {
    public static int maxProfit(int[] prices) {
        int length = prices.length;
        if(length == 0){
            return 0;
        }
        boolean b = false;
        boolean s = true;
        int buy = 0;
        int sell = 0;
        int profit = 0;
        for(int i=0;i<length-1;i++){
            int j=i+1;
            if(prices[i]<prices[j] && s == true){
                buy = prices[i];
                b = true;
                s = false;
            }
            if(prices[i]>prices[j] && b == true){
                sell = prices[i];
                b = false;
                s = true;
                profit = profit + (sell - buy);
            }       
        }
        if(s == false){
            sell = prices[length-1];
            profit = profit + (sell - buy);
        }
        return profit;
    }
    public static void main(String args[]){
        int prices[] = {1,2,3,4,5};
        int prof = maxProfit(prices);
        System.out.println("Maximum Profit is "+prof);
    }
}

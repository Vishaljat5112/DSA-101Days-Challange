public class buySellStocks {
        public static int buyAndSellStocks(int prices[]){
            int buyprice = Integer.MAX_VALUE;
            int maxprofit = 0;
            for (int i = 0; i<prices.length; i++){
                if (buyprice < prices[i]){ //buy price is less than today price mean price goes higher so sell
                    // the stock
                    int profit = prices[i] - buyprice;
                    maxprofit = Math.max(maxprofit, profit);
                }else {         //buy price is greater than today price mean today price come down so buy the
                    // stock on today price
                    buyprice = prices[i];
                }
            }
            return maxprofit;
        }
        public static void main(String[] args) {
            int prices[]= {7,1,5,3,6,4};
            System.out.println(buyAndSellStocks(prices));
    }
}

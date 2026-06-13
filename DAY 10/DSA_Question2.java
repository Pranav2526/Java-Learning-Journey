public class DSA_Question2
{
    public static void main(String args[])
    {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(BuyAndSellStocks(prices));
    }

    public static int BuyAndSellStocks(int prices[])
    {
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;   

        for(int i = 0; i<prices.length; i++)
        {
            if(BuyPrice < prices[i])  // Profit
            {
                int Profit = prices[i] - BuyPrice;   // Today's Profit
                MaxProfit = Math.max(MaxProfit, Profit);    // All Profits Combined
            }
            else
            {
                BuyPrice = prices[i];
            }
        }

        return MaxProfit;
    }
}
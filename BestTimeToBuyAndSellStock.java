public class BestTimeToBuyAndSellStock
 {
    public int maxProfit(int[] prices) 
    {
        int minPrice = Integer.MAX_VALUE; 
        int maxProfit = 0; // Step 2: Start with no profit

        // Step 3: Iterate over the prices
        for (int price : prices) 
        {
            System.out.println(price);
            if (price < minPrice) 
            {
                minPrice = price;
            }

            // Step 3.2: Calculate profit if sold today
            int currentProfit = price - minPrice;

            // Step 3.3: Update the maximum profit if the current profit is higher
            if (currentProfit > maxProfit) 
            {
                maxProfit = currentProfit;
            }
        }

        // Step 4: Return the maximum profit found
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + solution.maxProfit(prices)); // Output: 5
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            // Capture every uphill: if today > yesterday, sell!
            int dailyProfit = prices[i] - prices[i - 1];
            totalProfit += Math.max(0, dailyProfit);
        }
        
        return totalProfit;
    }
}
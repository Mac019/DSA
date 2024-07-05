class BuyAndSellStock {
    public int maxProfit(int[] mac) {
        int buy = mac[0];
        int profit = 0;
        for (int i = 1; i < mac.length; i++) {
            if (mac[i] < buy) {
                buy = mac[i];
            } else if (mac[i] - buy > profit) {
                profit = mac[i] - buy;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        BuyAndSellStock solution = new BuyAndSellStock();
        int[] mac = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + solution.maxProfit(mac));  // Output should be 5
    }
}

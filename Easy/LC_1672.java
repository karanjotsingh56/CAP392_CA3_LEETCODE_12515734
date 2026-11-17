class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;

        for (int[] customer : accounts) {
            int wealth = 0;
            for (int balance : customer) {
                wealth += balance;
            }
            richest = Math.max(richest, wealth);
        }

        return richest;
    }
}

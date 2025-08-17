class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0], max = 0;
        for(int i : prices){
            min = Math.min(min, i);
            max = Math.max(max, i-min);
        }return max;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
     int left = 0, rigth = left+1;
        int min=Integer.MAX_VALUE,max=0;
        while(rigth<prices.length){
            int t = prices[rigth]-prices[left];
            max=Math.max(t,max);
            if(prices[rigth]<prices[left]){
                left=rigth;
            }
            else {
                rigth++;
            }
        }
        return max;
    }
}

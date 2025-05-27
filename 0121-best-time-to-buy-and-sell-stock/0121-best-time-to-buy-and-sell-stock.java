class Solution {
    public int maxProfit(int[] prices) {
     int n=prices.length;
     int i=0;
     int j=0;
     int max=0;
     while(j<n){
        if(prices[j]-prices[i]<0){
            i=j;
            
        }
        if(prices[j]-prices[i]>max){
              max=prices[j]-prices[i];
        }
        j++;
     }
     return max;
    }
}

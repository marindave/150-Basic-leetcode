class Solution {
    public int maxSubArray(int[] nums) {
     int n=nums.length;
     int max=Integer.MIN_VALUE;
     int sum=0;
     int j=0;
     while(j<n){
        sum=sum+nums[j];
        if(sum>max) max=sum;
        if(sum<0) sum=0;
        j++;
     }
     return max;
    }
}
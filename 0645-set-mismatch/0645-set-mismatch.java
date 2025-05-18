class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans=new int[2];
        int n=nums.length;
        int expectedSum=(int) n*(n+1)/2;
        int actualSum=0;
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if((nums[i]^nums[j])==0){
                ans[0]=nums[i];
            }
        }
       } 
       for(int i=0;i<nums.length;i++){
        actualSum=actualSum+nums[i];
       }
       ans[1]=expectedSum-(actualSum-ans[0]);
       return ans;
    }
}
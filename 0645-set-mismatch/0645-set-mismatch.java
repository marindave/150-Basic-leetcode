class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] ans=new int[2];
        int n=nums.length;
        int expectedSum=(int) n*(n+1)/2;
        int s=0;
        int e=1;
        while(e<n){
            if((nums[s]^nums[e])==0){
                ans[0]=nums[s];
                break;
            }
            s++;
            e++;
        }
        int actualSum=0;
        for(int i=0;i<nums.length;i++){
        actualSum=actualSum+nums[i];
       }
       ans[1]=expectedSum-(actualSum-ans[0]);
       return ans;
    }
}
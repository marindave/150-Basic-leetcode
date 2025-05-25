class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        int max=0;
        while(j<n){
            if(nums[i]==1&&nums[j]==1){
                int length=j-i+1;
                if(length>max) max=length;
               j++;
            }else if(nums[j]==0){
                i=j;
                j++;
            }else{
                i++;
            
            }

        }
        return max;
    }
}
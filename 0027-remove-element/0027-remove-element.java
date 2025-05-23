class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        while(i<=j){
           if(nums[i]!=val&&nums[j]==val){
            i++;
            j--;
           }else if(nums[i]==val&&nums[j]!=val){
            nums[i]=nums[j];
            i++;
            j--;
           }else if(nums[i]!=val && nums[j]!=val){
            i++;
           }else if(nums[i]==val && nums[j]==val){
            j--;
           }
          
    }

     return j+1;
}
}
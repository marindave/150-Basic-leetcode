class Solution {
    public int removeDuplicates(int[] nums) {
       int i=0;
       int j=1;
       int k=0;
       while(j<nums.length){
        if(nums[i]!=nums[j]){
            nums[++i]=nums[j];
        }
        j++;
       }
       
       return i+1;
    }
}
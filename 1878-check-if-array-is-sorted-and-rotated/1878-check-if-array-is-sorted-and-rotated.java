class Solution {
    public boolean check(int[] nums) {
       boolean temp=false;
        if(nums.length==1) return true;
         
       
       int count=0;
       for(int i=0;i<nums.length;i++){
       if(i<nums.length-1&&nums[i]>nums[i+1]){
        count++;
       }
       }
       if(nums[0]>=nums[nums.length-1]&& count==1) return true;
       if(nums[0]<=nums[nums.length-1]&&count==0) return true;
       //if(count==1) return true;
       return  false;
    }
}
class Solution {
    public void sortColors(int[] nums) {
       int count0=0;
       int count1=0;
       int count2=0;
       for(int i=0;i<nums.length;i++){   
        if(nums[i]==0) count0++;
        if(nums[i]==1) count1++;
        if(nums[i]==2) count2++;
       } 
       //modifying the array
       for(int i=0;i<count0;i++){
        if(nums[i]==0)nums[i]=nums[i]-0;
       else if(nums[i]==1)nums[i]=nums[i]-1;
       else if(nums[i]==2)nums[i]=nums[i]-2;
       }
       for(int i=0;i<count1;i++){
        if(nums[i+count0]==0)nums[i+count0]=nums[i+count0]+1;
       else if(nums[i+count0]==1)nums[i+count0]=nums[i+count0]+0;
        else if(nums[i+count0]==2)nums[i+count0]=nums[i+count0]-1;
       }

       for(int i=0;i<count2;i++){
        if(nums[i+count0+count1]==0)nums[i+count0+count1]=nums[i+count0+count1]+2;
       else if(nums[i+count0+count1]==1)nums[i+count0+count1]=nums[i+count0+count1]+1;
        else if(nums[i+count0+count1]==2)nums[i+count0+count1]=nums[i+count0+count1]+0;
       }
    }
}
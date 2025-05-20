class Solution {
    public boolean isMonotonic(int[] nums) {
     int n=nums.length;
     boolean isMonotonic=false;
     if(n==1) return true;
     if(nums[0]>nums[n-1]){
        int i=0;
        
        while(i<n-1){
            if(nums[i]>=nums[i+1]){
                i++;
            
                isMonotonic=true;
            }else{
                 isMonotonic=false;
                 
                 break;
            }
            
        }
     }
     if(nums[0]<nums[n-1]){
        int i=0;
        
        while(i<n-1){
            if(nums[i]<=nums[i+1]){
                i++;
            
                isMonotonic=true;
            }else{
                 isMonotonic=false;
                 break;
                 
            }
            
        }
     }
    if(nums[0]==nums[n-1]){
        int i=0;
        //int j=n-1;
        while(i<n-1){
            if(nums[i]==nums[i+1]){
                i++;
                //j--;
                isMonotonic=true;
            }else{
                 isMonotonic=false;
                 break;
            }
        }
     }
     return isMonotonic;
    }
}
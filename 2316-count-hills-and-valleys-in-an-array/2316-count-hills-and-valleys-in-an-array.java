class Solution {
    public int countHillValley(int[] nums) {
        //counting Hills
        int n=nums.length;
        int hills=0;
        for(int p=0;p<n;p++){
            int target=nums[p];
            if(p>0&&nums[p]==nums[p-1]) continue;
            int i=p-1;
            int j=p+1;
            while(i>=0 && j<n){
                if(target==nums[j]&&target>nums[i]){
                    j++;
                }else if(target==nums[i]&& target>nums[j]){
                    i--;
                
                }else if(target>nums[i] && target>nums[j]){
                    hills++;
                    break;
                   
                }else{
                    i--;
                    j++;
                    break;
                }
            }
        }
        //counting valleys
    int valleys=0;
        for(int p=0;p<n;p++){
            int target=nums[p];
            if(p>0&&nums[p]==nums[p-1]) continue;
            int i=p-1;
            int j=p+1;
            while(i>=0 && j<n){
                if(target==nums[j] && target<nums[i]){
                    j++;
                }else if(target==nums[i] && target<nums[j]){
                    i--;
            
                } else if(target<nums[i] && target<nums[j]){
                    valleys++;
                    break;
                }else{
                    i--;
                    j++;
                    break;
                }
                
            }
        }
        return hills + valleys;
    }
}
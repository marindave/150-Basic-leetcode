class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            int target=nums[i];
            int count=0;
            for(int j=0;j<n;j++){
                if(target==nums[j]) count++;
            }
            if(count>n/2) return nums[i];
        }
        return 0;
    }
}
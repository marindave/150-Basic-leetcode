class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int n=nums.length;
       //just find the number of requres swaps that will depend upon the position of 1 and n
       //finding position of 1
       int x=0;
       for(int i=0;i<n;i++){
        if(nums[i]==1) {
            x=i;
            break;
        }
       }
       //finding position of n
       int y=0;
       for(int i=0;i<n;i++){
        if(nums[i]==n){
            y=i;
            break;
        }
       }
      if(x<y) return x+(n-y-1);
      if(x>y) return x+(n-y-1)-1;
      return 0;
   }
}
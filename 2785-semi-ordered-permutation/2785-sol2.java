class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int n=nums.length;
        if(nums[0]==1&&nums[n-1]==n) return 0;
        if(n!=2&&nums[1]==1&&nums[n-2]==n) return 2;
        if(nums[1]==1&&nums[n-1]==n) return 1;
        if(n==2&&nums[0]==n&&nums[n-1]==1) return 1;
       // if(nums[])
        //now looking for 1
        int count1=0;
        for(int i=2;i<n;i++){
            if(nums[i]==1){
            while(i>0&&nums[1]!=1){
                    swap(nums,i,i-1);
                    count1++;
                    i--;
                }
                break;
            }
        }
        //now looking for n
        int count2=0;
        for(int i=0;i<n-2;i++){
            if(nums[i]==n){
                while(i<n-1&&nums[n-2]!=n){
                    swap(nums,i,i+1);
                    count2++;
                    i++;
                }
                break;
            }
        }
        if(nums[0]==1&&nums[n-2]==n) return count1+count2+1;
        if(nums[1]==1&&nums[n-1]==n) return count1+count2+1;
        return count1+count2+2;
   }
   public static void swap(int[]nums,int a ,int b){
    int temp=nums[a];
    nums[a]=nums[b];
    nums[b]=temp;
   }

   
}

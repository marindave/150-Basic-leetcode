class Solution {
    public void rotate(int[] nums, int k) {
      int n=nums.length;
      int[] arr=new int[n];
      k=k%n;
      
      for(int i=0;i<n;i++){
        arr[i]=nums[i];
      }
      
      for(int i=0;i<k;i++){
        nums[i]=arr[n-k+i];
      }
      for(int i=0;i<n-k;i++){
        nums[k+i]=arr[i];
      }
    } 
}
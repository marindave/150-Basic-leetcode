class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]==0 && nums[j]!=0){
                swap(nums,i,j);
                i++;
                j++;
            }
            else if(nums[i]==0&&nums[j]==0){
                j++;
            }else{
                i++;
                j++;
            }
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
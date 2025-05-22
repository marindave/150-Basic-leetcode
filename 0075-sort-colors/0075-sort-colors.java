class Solution {
    public void sortColors(int[] nums) {
      //By using counting sort
      //because we know the range of values of nums which is 0-2;
      int[]count=new int[3];
      for(int i=0;i<nums.length;i++){
        count[nums[i]]++;
      }
      int index=0;
      for(int i=0;i<=2;i++){
        while(count[i]>0){
          nums[index]=i;
          index++;
          count[i]--;   
        }
      }
    }
}
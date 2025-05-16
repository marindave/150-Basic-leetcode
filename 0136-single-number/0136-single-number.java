class Solution {
    public int singleNumber(int[] nums) {
        int[] ans=new int[32];
        int temp=0;
        for(int i=31;i>=0;i--){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%2!=0) ans[i]=++count;
                nums[j]=nums[j]>>1;
            }
            
        }
      // now this part is important because wer are reconstruting our unique number;
    int result = 0;
    for (int i = 0; i < 32; i++) {
        result = (result << 1) | (ans[i] % 2);
    }

    return result;
    }
}
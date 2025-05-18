class Solution {
    public int[] findErrorNums(int[] nums) {
       //let us just do this question only by bit manipulation
       int xor1=0;
       int xor2=0;
       for(int i=0;i<nums.length;i++){
        xor2=xor2^nums[i];
       }
       for(int i=1;i<=nums.length;i++){
        xor1=xor1^i;
       }
       int xor=xor1^xor2;
       //till this you need to understand that the xor is containing the xor of repeating and duplicate number
       // so our next aim is to just partition this xor into respective repeating and duplicate number
    int temp=((xor)&(-xor));//temp is having the rightmostbit
    int x=0;
    int y=0;
    for(int i=0;i<nums.length;i++){
        if((nums[i]&temp)==0) x=x^nums[i];
        else y=y^nums[i];
    }
    for(int i=1;i<=nums.length;i++){
        if((i&temp)==0) x=x^i;
        else y=y^i;
    }
     for(int i=0;i<nums.length;i++){
        if(nums[i]==x) return new int[]{x,y};
     }
     return new int[]{y,x};
    }
}
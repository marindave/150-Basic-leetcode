class Solution {
    public int findComplement(int num) {
        int count=0;
        int x=num;
      while(num>0){
        count++;
        num=num>>1;
}
   int temp=(int)(Math.pow(2,count)-1);
   return x^temp;
    }
}
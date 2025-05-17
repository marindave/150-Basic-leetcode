class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
           int count=0;
        int t=n;
     while(n>0){
        count++;
        n=n>>1;
     }
     int temp=(int)(Math.pow(2,count)-1);
     return temp^t;
    }
}
class Solution {
    public int hammingWeight(int n) {
        int value=2;
        int count=0;
        while(n>0){
         if(n%2!=0) count++;
         n=n>>1;//n=n/2;
        }
        return count;
    }
}
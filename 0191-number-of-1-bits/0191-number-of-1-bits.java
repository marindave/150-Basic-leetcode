class Solution {
    public int hammingWeight(int n) {
        int value=2;
        int count=0;
        while(n>0){
         n=n&(n-1);
         count++;
        }
        return count;
    }
}
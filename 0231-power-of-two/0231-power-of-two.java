class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        if(n<0) return false;
        int temp=n&(-n);
       if(temp==n) return true;
       return false;
    }
}
class Solution {
    public boolean hasAlternatingBits(int n) {
      while(n>0){
        int t1=n%2;
        n=n>>1;
        int t2=n%2;
        if(t1==1&t2==1) return false;
        if(t1==0&t2==0) return false;
       // n=n>>1;
      }
      return true;
    }
}
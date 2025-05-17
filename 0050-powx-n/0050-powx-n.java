class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        double base=x;
        long t=Math.abs((long)n);
        while(t>0){
            if((t&1)==1) ans=ans*base;
             base=base*base;
            t=t>>1;
        }
        if(n<0) return 1/(ans);
        return ans;
    }
}
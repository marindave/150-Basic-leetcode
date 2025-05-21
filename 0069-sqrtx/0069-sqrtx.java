class Solution {
    public int mySqrt(int x) {
     //BY NRM (NEWTON RAPHSON METHOD)
     if(x==0) return 0;
     double t=x;
     double root=0;
     while(true){
         root=(0.5*(t+x/t));
        if(Math.abs(root-t)<1) break;
        t=root;
     }
     return (int)root;
    }
}
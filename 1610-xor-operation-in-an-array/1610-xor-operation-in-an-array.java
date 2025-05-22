class Solution {
    public int xorOperation(int n, int start) {
      int xor=0;
      int i=0;
      while(i<n){
       int temp=start+2*i;
        xor=(xor^temp);
        i++;
      }
      return xor;
    }
}
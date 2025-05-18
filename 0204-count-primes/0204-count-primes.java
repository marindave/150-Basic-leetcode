class Solution {
    public int countPrimes(int n) {
      boolean[] prime=new boolean[n];
      sieve(n,prime);
      int count=0;
      for(int p=2;p<n;p++){
        if(!prime[p]) count++;
      }
      return count;
    }
    public static void sieve(int n,boolean[] prime){
        for(int c=2;c*c<=n;c++){
            if(!prime[2]){
                for(int j=2*c;j<n;j+=c){
                    prime[j]=true;
                }
            }
        }
    }
}
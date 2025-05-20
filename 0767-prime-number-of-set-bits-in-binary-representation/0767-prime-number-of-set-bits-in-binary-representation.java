class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans=0;
        for(int i=left;i<=right;i++){
            int num=i;
            int count=0;
            while(num>0){
                if((num&1)==1) count++;
                num=num>>1;
            }
            if(isPrime(count)) ans++;
        }
        return ans;
    }
    public static boolean isPrime(int n){
        if(n==2) return true;
        if(n==1) return false;
        for(int c=2;c*c<=n;c++){
            if(n%c==0) return false;
        }
        return true;
    }
}
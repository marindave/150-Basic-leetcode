class Solution {
    public int[] countBits(int n) {
    int[] ans=new int[n+1];
    for(int i=0;i<=n;i++){
        int target=i;
        int count=0;
        while(target>0){
            if(target%2!=0) ans[i]=++count;
            target=target>>1;
        }
    }
    return ans;
    }
}
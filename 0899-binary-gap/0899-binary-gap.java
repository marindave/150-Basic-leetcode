class Solution {
    public int binaryGap(int n) {
    int[] arr=new int[32];
    //storing bits of a given number n in an array
    for(int i=31;i>=0;i--){
        int result=n&1;
        arr[i]=result ;
        n=n>>1;
    }
    //applying sliding window to get distances between two 1's
    int i=0;
    int j=1;
    int count=0;
    int max=0;
    while(j<32){
        if(arr[i]==1&& arr[j]==0){
            j++;
        }else if(arr[i]==1&&arr[j]==1){
            count=j-i;
            i=j;
            j++;
           
        
        }else{
            i++;
            j++;
        }
        if(count>max) max=count;
        
    }
   return max;
}
}
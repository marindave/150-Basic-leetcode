class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        //finding the number having maximum no of bits
        int[] ans=new int[n];
       
        for(int i=0;i<n;i++){
            int num=arr[i];
            int count=0;
            while(num>0){
                if((num&1)==1) count++;
                num=num>>1;
            }
            ans[i]=count;
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(ans[j]>ans[j+1]){
                swap(arr,j,j+1);
                swap(ans,j,j+1);
                } 
                if(ans[j]==ans[j+1]){
                    if(arr[j]>arr[j+1]) swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }
    public static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
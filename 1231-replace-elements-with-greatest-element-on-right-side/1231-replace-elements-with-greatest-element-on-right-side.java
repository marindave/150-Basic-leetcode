class Solution {
    public int[] replaceElements(int[] arr) {
     int n=arr.length;
     int[] ans=new int[n];
     int j=n-1;
     int max=-1;
     ans[j]=-1;
     while(j>=0){
        ans[j]=max;
        if(arr[j]>max){
            max=arr[j];
            
        }
        
        j--;
    
     }
     return ans;
    }
}
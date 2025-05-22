class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    for(int i=0;i<n;i++){
        nums1[m+i]=nums2[i];
    }
    sort(nums1);
    }
    public static void sort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]) swap(arr,j,j-1);
                else break;
            }
        }
    }
    public static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
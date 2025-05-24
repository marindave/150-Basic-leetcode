class Solution {
    public void setZeroes(int[][] matrix) {
      int  m= matrix.length;
       int n=matrix[0].length;
      HashSet<Integer>row=new HashSet<>();
      HashSet<Integer>col=new HashSet<>();
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(matrix[i][j]==0){
                row.add(i);
                col.add(j);
            }
        }
      }
       List<Integer> list1 = new ArrayList<>(row);
       for(int i=0;i<list1.size();i++){
        int p1=list1.get(i);
        for(int j=0;j<n;j++){
            matrix[p1][j]=0;
        }
       }
       List<Integer> list2 = new ArrayList<>(col);
       for(int i=0;i<list2.size();i++){
        int p2=list2.get(i);
        for(int j=0;j<m;j++){
            matrix[j][p2]=0;
        }
       }
    }
}
class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for(int i=0; i<m; i++){
            for(int j=i+1; j<n; j++){
                swap(matrix,i,j,j,i);
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n/2; j++){
                swap(matrix, i,j,i,n-1-j);
            }
        }
    }
    private void swap(int[][] mat, int i, int j, int p, int q){
        int temp = mat[i][j];
        mat[i][j] = mat[p][q];
        mat[p][q] = temp;
    }
}
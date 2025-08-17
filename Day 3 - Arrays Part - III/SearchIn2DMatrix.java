public class SearchIn2DMatrix {
	    public boolean searchMatrix(int[][] matrix, int target) {
	        int m = matrix.length, n = matrix[0].length;
	        for(int[] arr : matrix){
	            if(target <= arr[n-1] && Arrays.binarySearch(arr, target) >= 0)return true;
	        }return false;
	    }
}

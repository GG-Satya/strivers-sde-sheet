import java.util.HashMap;
import java.util.Map;

public class Largest_Subarray_with_K_sum {
	
	//Brute Force
	public static int longestSubarray(int[] arr, int k) {
        int max = 0;
        for(int i=0; i<arr.length; i++){
            int sum =0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                if(sum == k){
                    int length = j-i+1;
                    if(length > max) max = length;
                }
            }
        }
        return max;
    }
	
	//Optimized
	public static int longestSubarray2(int[] arr, int k) {
        int max = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,  -1);
        for(int i=0; i<arr.length; i++) {
        	sum += arr[i];
        	
        	if(map.containsKey(sum-k)) {
        		int len = i - map.get(sum-k);
        		if(len > max)max = len;
        	}
        	if(!map.containsKey(sum)) {
        		map.put(sum, i);
        	}
        }
        return max;
    }
	
	public static void main(String[] args) {
        
		System.out.println("Test 0: " + longestSubarray(new int[]{94, -33, -13, 40, -82, 94, -33, -13, 40, -82}, 52)); // Expected: 3 (40, -82, 94 or 3)
        
        System.out.println("Test 1: " + longestSubarray2(new int[]{10, 5, 2, 7, 1, -10}, 15)); // Expected: 6 (10, 5, 2, 7, 1, -10)
        
        System.out.println("Test 2: " + longestSubarray(new int[]{5, 5, 5}, 2)); // Expected: 0

        System.out.println("Test 3: " + longestSubarray(new int[]{1, -1, 5, -2, 3}, 3)); // Expected: 4 (1, -1, 5, -2)

        System.out.println("Test 4: " + longestSubarray(new int[]{2, 2, 2}, 6)); // Expected: 3

        System.out.println("Test 5: " + longestSubarray(new int[]{1, 2, 3}, 2)); // Expected: 1

        System.out.println("Test 6: " + longestSubarray(new int[]{1, 1, 1, 1, 1}, 2)); // Expected: 2

        System.out.println("Test 7: " + longestSubarray(new int[]{}, 5)); // Expected: 0
    }
}

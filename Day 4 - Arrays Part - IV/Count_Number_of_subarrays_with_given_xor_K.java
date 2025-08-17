import java.util.HashMap;
import java.util.Map;

public class Count_Number_of_subarrays_with_given_xor_K {
	// Brute Force
		public static long subarrayXor(int arr[], int k) {
			long count = 0;
	        for(int i=0; i<arr.length; i++){
	            int xor = 0;
	            for(int j = i; j<arr.length; j++){
	                xor ^= arr[j];
	                if(xor == k)count++;
	            }
	        }
	        return count;
	    }
	    
		// Optimized (Formula: x = xor ^ k)
		public static long subarrayXor2(int arr[], int k) {
	        long count = 0;
	        Integer xor = 0;
	        Map<Integer, Integer> map = new HashMap<>();
	        map.put(0, 1);
	        for(int num : arr){
	            xor ^= num;
	            if(map.containsKey(xor ^ k)){
	                count += map.get(xor^k);
	            }
	            map.put(xor, map.getOrDefault(xor, 0)+1);
	        }
	        return count;
	    }
		
		
		public static void main(String[] args) {
			System.out.println(subarrayXor(new int[] {4,2,2,6,4}, 6));
			System.out.println(subarrayXor2(new int[] {4,2,2,6,4}, 6));
		}
}

public class MajorityElement_02 {

    //Approach-01

    public List<Integer> majorityElement(int[] nums) {
        int target = nums.length/3;
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i : nums){
            int freq = map.getOrDefault(i,0)+1;
            if(freq > target && !list.contains(i)){
                list.add(i); 
            }
            map.put(i,freq);
        }
	return list;
    }

}

class Longest_Consecutive_Sequence{

    // Using Soritng (18 ms)
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 0) return 0;
        Arrays.sort(nums);
        int max = 1, count = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] == nums[i])continue;
            if(nums[i-1] + 1 == nums[i])count++;
            else count =1;
            if(count > max) max = count;
        }
        return max;
    }

    //Using HashMap ( 31 ms)
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int max = 1;
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        for(int num : set){
            int count = 1;
            if(!set.contains(num-1)){
                while(set.contains(num + count)) count++;
            }
            if(count > max) max = count;
        }
        return max;
    }

}
// Brute force
// ===========


class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i))return i;
            set.add(i);
        }
        return -1;
    }
}


// Optimal
// =======

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = slow;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(fast != slow);
        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
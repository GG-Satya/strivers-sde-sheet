public class MajorityElement_01 {

    //Approach-01

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }



    //Approach-02 (More Effecient)

    public int majorityElement(int[] nums) {
        int count = 1, major = nums[0];
        for(int i=1; i<nums.length; i++){
            if(count == 0){
                count++;
                major = nums[i];
            }else if(major == nums[i]){
                count++;
            }else{
                count--;
            }
        }return major;
    }
}

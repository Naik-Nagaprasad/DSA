class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int i=0; i<nums.length; i++){
            int res = map.get(nums[i]);
            if(res > (nums.length/2))
                return nums[i];
        }
        return 0;
    }
}
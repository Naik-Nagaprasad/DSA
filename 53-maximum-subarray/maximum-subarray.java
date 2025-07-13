class Solution {
    public int maxSubArray(int[] nums) {
        int maxEnding = nums[0];
        int res = nums[0];

        for(int i=1; i<nums.length; i++){
            maxEnding = Math.max(nums[i], maxEnding+nums[i]);
            res = Math.max(maxEnding, res);
        }
        return res;
    }
}
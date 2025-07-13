class Solution {
    public int maxProfit(int[] nums) {
        int res=0, min=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]>min)
                res = Math.max(res, nums[i]-min);
            min = Math.min(min, nums[i]);
        }
        return res;
    }
}
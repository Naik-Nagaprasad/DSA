class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        int s=0, sum=0;
        for(int e=0; e<nums.length; e++){
            sum += nums[e];

            while(sum >= target){
                len = Math.min(len, e-s+1);
                sum -= nums[s];
                s++;
            }
   
        }
        if(len == Integer.MAX_VALUE)
            return 0;
        return len;
    }
}
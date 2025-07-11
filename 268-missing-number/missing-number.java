class Solution {
    public int missingNumber(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     map.put(nums[i], 1);
        // }
        // int res = 0;
        // for(int i=0; i<=nums.length; i++){
        //     if(map.getOrDefault(i, 0) == 0){
        //         res = i;
        //     }
        // }
        // return res;
        int n = nums.length;
        int sum = n * (n+1) / 2;
        int currSum=0;
        for(int i=0; i<n; i++){
            currSum += nums[i];
        }
        return sum-currSum;
    }
}
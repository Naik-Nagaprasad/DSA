class Solution {
    public int subarraySum(int[] nums, int k) {
        //sliding window won't work if it has -ve numbers
        //this is the potimal solution when arr has -ve numbers
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0, rem=0, res=0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];

            if(sum == k)
                res++;

            rem = sum - k;

            if(map.get(rem) != null){
                res += map.get(rem);
            }

            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return res;
    }
}
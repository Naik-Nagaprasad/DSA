class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        //brute force
        // for(int i=0; i<nums.length-1; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]+nums[j]==target){
        //             a[0] = i;
        //             a[1] = j;
        //         }
        //     }
        // }
    
        //optimal when indices have to be returned
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int rem = target - nums[i];
            int x = map.getOrDefault(rem, -1);
            if(x != -1){
                a[0] = x;
                a[1] = i;
                break;
            }else{
                map.put(nums[i], i);
            }
        }
        //if ques is to check whether 2 values exist or not then use the anology
        //sort array -> two pointers while low<high if sum+low>target -> low++ or
        //high-- 
        return a;
    }
}
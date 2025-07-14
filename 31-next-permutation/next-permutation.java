class Solution {
    public static void reverse(int[] nums, int low, int high){
        while(low <= high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++; high--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;

        for(int i=n-1; i>0; i--){
            if(nums[i-1]<nums[i]){
                idx = i-1;
                break;
            }

        }
        if(idx == -1){
            reverse(nums, 0, n-1);
            return;
        }

        for(int i=n-1; i>idx; i--){
            if(nums[i] > nums[idx]){
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        reverse(nums, idx+1, n-1);
    }
}
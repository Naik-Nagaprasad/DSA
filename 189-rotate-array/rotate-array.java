class Solution {
    public static void reverse(int[] nums, int low, int high){
        while(low <= high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k>=n)
            k = k % n;
        else if(k <= 0)
            return;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0, j=0;
        for(i=1; i<nums.length; i++){
            if(nums[j] != nums[i]){
                j++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return j+1;
    }
}
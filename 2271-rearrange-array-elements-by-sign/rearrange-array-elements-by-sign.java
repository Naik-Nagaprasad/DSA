class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        //brute force
        // int[] even = new int[n/2];
        // int[] odd = new int[n/2];
        // int e=0, o=0;
        // for(int i=0; i<n; i++){
        //     if(nums[i]>=0)
        //         even[e++] = nums[i];
        //     else
        //         odd[o++] = nums[i];
        // }
        // e=0; o=0;
        // for(int i=0; i<n; i++){
        //     if( i%2 == 0)
        //         nums[i] = even[e++];
        //     else
        //         nums[i] = odd[o++];
        // }

        //small change
        int[] arr = new int[n];
        int p=0, neg=1;
        for(int i=0; i<n; i++){
            if(nums[i]>=0){
                arr[p] = nums[i];
                p += 2;
            }else{
                arr[neg] = nums[i];
                neg += 2;
            }
        }
        return arr;
    }
}
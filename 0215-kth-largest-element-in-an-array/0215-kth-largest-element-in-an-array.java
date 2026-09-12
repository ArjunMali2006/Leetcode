class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        // int largest=0;
        // for(int i=0;i<nums.length;i++){
        //     largest=Math.max(largest,nums[i]);
        // }
        return nums[nums.length-k];
    }
}
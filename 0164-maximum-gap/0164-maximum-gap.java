class Solution {
    public int maximumGap(int[] nums) {
        
        Arrays.sort(nums);
        int a=0;
        for(int i=1;i<nums.length;i++){
          a=Math.max(a,(nums[i]-nums[i-1]));
        }
        return a;
    }
}
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> ans = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(ans.contains(nums[i])){
                return true;
            }
            else{
                ans.add(nums[i]);
                }
        if(i>=k){
        ans.remove(nums[i-k]);
        }
        }
        return false;
    }
}
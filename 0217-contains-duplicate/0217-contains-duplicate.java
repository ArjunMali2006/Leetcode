class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ele = new HashSet<>();
        boolean found=false;
        for(int i=0;i<nums.length;i++){
            if(ele.contains(nums[i])){
                found=true;
                break;
            }
            else{
                ele.add(nums[i]);
            }
        }
        return found;
    }
}
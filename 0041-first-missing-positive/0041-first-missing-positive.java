import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();

       long max=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
       }
       for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
       }
       if(!set.contains(1)){
        return 1;
       }
       for (int i = 1; i <= max + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 1;
    }
}
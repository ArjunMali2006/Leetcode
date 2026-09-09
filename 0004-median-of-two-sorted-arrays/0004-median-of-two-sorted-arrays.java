class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int ans[]=new int[n];
        for(int i=0;i<nums1.length;i++){
            ans[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            ans[nums1.length+i]=nums2[i];
        }
        Arrays.sort(ans);
        if(n%2!=0){
            return ans[n/2];
        }
        int med=ans.length/2;
        int med1=med-1;
        return (double)(ans[med]+ans[med1])/2.0;
    }
}
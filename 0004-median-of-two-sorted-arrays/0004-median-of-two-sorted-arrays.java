class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n =nums1.length+nums2.length;
        int m=nums2.length;
        int o=nums1.length;
        int ans[]=new int[n];
        int j=0;
        int k=0;
        int i=0;
        if (o == 0) {
            int mid = m / 2;
            if (m % 2 != 0) return nums2[mid];
            return (nums2[mid - 1] + nums2[mid]) / 2.0;
        }
        if (m == 0) {
            int mid = o / 2;
            if (o % 2 != 0) return nums1[mid];
            return (nums1[mid - 1] + nums1[mid]) / 2.0;
        }
            while(j<nums1.length && k<nums2.length){
            if(nums1[j]<=nums2[k]){
                ans[i++]=nums1[j++];
            }
            else{
                ans[i++]=nums2[k++];
            }
            }
            while(j<nums1.length){
                ans[i++]=nums1[j++];
            }
            while(k<nums2.length){
                ans[i++]=nums2[k++];
            }
            int mid=n/2;
            if(n%2!=0){
                return ans[mid];
            }
            
        return (ans[mid]+ans[mid-1])/2.0;
    }
}

        // int n=nums1.length+nums2.length;
        // int ans[]=new int[n];
        // for(int i=0;i<nums1.length;i++){
        //     ans[i]=nums1[i];
        // }
        // for(int i=0;i<nums2.length;i++){
        //     ans[nums1.length+i]=nums2[i];
        // }
        // Arrays.sort(ans);
        // if(n%2!=0){
        //     return ans[n/2];
        // }
        // int med=ans.length/2;
        // int med1=med-1;
        // return (double)(ans[med]+ans[med1])/2.0;
   /// }
//}
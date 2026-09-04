class Solution {
    public int characterReplacement(String s, int k) {
        int arr[]=new int[26];
        
        int left=0;
        int right=0;
        int maxFreq=0,max=0;
        while(right<s.length()){
            arr[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq, arr[s.charAt(right)-'A']);
            if((right-left+1)-maxFreq>k){
                
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            
            max=Math.max(right-left+1,max);
            right++;
        }
        return max;
    }
}
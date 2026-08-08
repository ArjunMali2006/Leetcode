class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle)){
            return 0;
        }
        for(int i=0;i<haystack.length();i++){
            String str=haystack.substring(i,haystack.length());
            if(str.startsWith(needle)){
                return i;
            }
        }
        return -1;
    }
}
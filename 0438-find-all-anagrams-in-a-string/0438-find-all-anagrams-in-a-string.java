import java.util.Arrays;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans=new ArrayList<>();
        int pcount[]=new int[26];
        int wcount[]=new int[26];
        if(s.length()<p.length()){
            return ans;
        }
        for(int i=0;i<p.length();i++){
            pcount[p.charAt(i) - 'a']++;
        }
        for(int i=0;i<p.length();i++){
            wcount[s.charAt(i) - 'a']++;
        }
        if(Arrays.equals(pcount,wcount)){
            ans.add(0);
        }
        for(int i=p.length();i<s.length();i++){
            wcount[s.charAt(i-p.length()) - 'a']--;
            wcount[s.charAt(i) - 'a']++;

            if(Arrays.equals(pcount,wcount)){
                ans.add(i-p.length()+1);
            }
        }
        return ans;
    }
}
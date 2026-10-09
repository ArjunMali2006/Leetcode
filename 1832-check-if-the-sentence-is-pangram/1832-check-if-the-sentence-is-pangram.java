class Solution {
    public boolean checkIfPangram(String sentence) {
      HashSet<Integer> set=new HashSet<>();
      for(int i=0;i<sentence.length();i++){
        set.add(sentence.charAt(i)-'a');
      }  
      return set.size()==26;
    }
}
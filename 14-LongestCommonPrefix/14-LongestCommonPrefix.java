// Last updated: 04/06/2026, 11:21:02
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre=strs[0];
        for(int i=1;i<strs.length;i++){
            String word=strs[i];
            int n=Math.min(word.length(),pre.length());
            int j=0;
            while(j<n && pre.charAt(j)==word.charAt(j)){
                j++;
            }
            pre=word.substring(0,j);
            if(pre.isEmpty())   return "";
        }
        return pre;
    }
}
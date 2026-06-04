// Last updated: 04/06/2026, 11:15:54
class Solution {
    public String[] findWords(String[] words) {
        String first="qwertyuiop";
        String sec="asdfghjkl";
        String third="zxcvbnm";
        ArrayList<String> arrList=new ArrayList<>();
        for(String word:words){
            String lower=word.toLowerCase();
            char ch=lower.charAt(0);
            String row=first.contains(ch+"")?first:sec.contains(ch+"")?sec:third;
            boolean isValid=true;
            for(char c:lower.toCharArray()){
                if(!row.contains(c+"")){
                    isValid=false;
                    break;
                }
            }
            if(isValid){
                arrList.add(word);
            }
        }
        String[] res=new String[arrList.size()];
        int i=0;
        for(String str:arrList){
            res[i++]=str;
        }
        return res;
    }
}
// Last updated: 04/06/2026, 11:11:58
class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        String[] res=new String[arr.length];
        for(String word:arr){
            int i=word.charAt(word.length()-1)-'0';
            res[i-1]=word.substring(0,word.length()-1);
        }
        return String.join(" ",res);
    }
}
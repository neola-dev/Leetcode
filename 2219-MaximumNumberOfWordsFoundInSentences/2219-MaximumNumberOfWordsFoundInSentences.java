// Last updated: 04/06/2026, 11:11:41
class Solution {
    public int countSpaces(String str){
        int space=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                space++;
            }
        }
        return space+1;
    }
    public int mostWordsFound(String[] sentences) {
        int n=sentences.length;
        int maxWords=0;
        for(int i=0;i<n;i++){
            String str=sentences[i];
            int cnt=countSpaces(str);
            maxWords=Math.max(maxWords,cnt);
        }
        return maxWords;
    }
}
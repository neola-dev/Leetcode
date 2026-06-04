// Last updated: 04/06/2026, 11:16:33
class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            arr[ch-'a']--;
            if(arr[ch-'a']<0){
                return ch;
            }
        }
        return '\0';
    }
}
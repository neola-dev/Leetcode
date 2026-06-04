// Last updated: 04/06/2026, 11:16:34
class Solution {
    public int firstUniqChar(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int j=0;j<s.length();j++){
            if(arr[s.charAt(j)-'a']==1) return j;
        }
        return -1;
    }
}
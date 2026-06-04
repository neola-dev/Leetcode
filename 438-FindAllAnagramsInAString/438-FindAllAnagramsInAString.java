// Last updated: 04/06/2026, 11:16:14
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ls=new ArrayList<>();
        if(s.length()<p.length())   return ls;
        int[] freq=new int[26];
        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
        }
        int cnt=p.length();
        int left=0;
        int right=0;
        while(right<s.length()){
            char chR=s.charAt(right);
            if(freq[chR-'a']>0){
                cnt--;
            }
            freq[chR-'a']--;
            right++;
            if(right-left==p.length()){
                if(cnt==0)  ls.add(left);
                char chL=s.charAt(left);
                if(freq[chL-'a']>=0)    cnt++;
                freq[chL-'a']++;
                left++;
            }   
        }
        return ls;
    }
}
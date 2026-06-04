// Last updated: 04/06/2026, 11:12:43
class Solution {
    public int numberOfSubstrings(String s) {
        int l=0;
        int r=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int cnt=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()==3){
                cnt+=s.length()-r;
                char chL=s.charAt(l);
                map.put(chL,map.getOrDefault(chL,0)-1);
                if(map.get(chL)<=0){
                    map.remove(chL);
                }
                l++;
            }
            r++;
        }
        return cnt;
    }
}
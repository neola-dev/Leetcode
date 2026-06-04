// Last updated: 04/06/2026, 11:17:57
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> hmap=new HashMap<>();
        Set<Character> hset=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(hmap.containsKey(ch1)){
                if(hmap.get(ch1)!=ch2){
                    return false;
                }
            }
            else{
                if(hset.contains(ch2)){
                    return false;
                }
                hmap.put(ch1,ch2);
                hset.add(ch2);
            }
        }
        return true;
    }
}
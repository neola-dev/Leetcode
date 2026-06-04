// Last updated: 04/06/2026, 11:10:43
class Solution {
    public int prefixConnected(String[] words, int k) {
        HashMap<String,Integer> hmap=new HashMap<>();
        for(String word:words){
            if(word.length()<k) continue;
            String pre=word.substring(0,k);
            hmap.put(pre,hmap.getOrDefault(pre,0)+1);
        }
        int cnt=0;
        for(int freq:hmap.values()){
            if(freq>=2){
                cnt++;
            }
        }
        return cnt;
    }
}
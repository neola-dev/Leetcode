// Last updated: 04/06/2026, 11:11:44
class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> hmap1=new HashMap<>();
        HashMap<String,Integer> hmap2=new HashMap<>();
        for(String word:words1){
            hmap1.put(word,hmap1.getOrDefault(word,0)+1);
        }
        for(String word:words2){
            hmap2.put(word,hmap2.getOrDefault(word,0)+1);
        }
        int cnt=0;
        for(String i:hmap1.keySet()){
            if(hmap2.containsKey(i) && hmap1.get(i)==1 && hmap2.get(i)==1){
                cnt++;
            }
        }
        return cnt;
    }
}
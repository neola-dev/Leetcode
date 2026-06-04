// Last updated: 04/06/2026, 11:16:10
class Solution {
    public String frequencySort(String s) {
        int size=s.length();
        Map<Character,Integer> hmap=new HashMap<>();
        for(int i=0;i<size;i++){
            char ch=s.charAt(i);
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }
        List<Character>[] buckets=new List[size+1];
        for(char ch:hmap.keySet()){
            int freq=hmap.get(ch);
            if(buckets[freq]==null){
                buckets[freq]=new ArrayList<>();
            }
            buckets[freq].add(ch);
        }
        StringBuilder res=new StringBuilder();
        for(int i=buckets.length-1;i>=0;i--){
            if(buckets[i]!=null){
                for(char ch:buckets[i]){
                    for(int j=0;j<i;j++){
                        res.append(ch);
                    }
                }
            }
        }
        return res.toString();
    }
}
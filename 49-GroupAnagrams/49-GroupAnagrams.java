// Last updated: 04/06/2026, 11:20:18
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList<>();
        }
        HashMap<String,List<String>> map=new HashMap<>(); 
        for(String word:strs){
            int[] count=new int[26];
            for(int i=0;i<word.length();i++){
                count[word.charAt(i)-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int c:count){
                sb.append("#").append(c);
            }
            String key=sb.toString();
            if(map.containsKey(key)){
                map.get(key).add(word);
            }
            else{
                map.put(key,new ArrayList<>());
                map.get(key).add(word);
            }
        }
        List<List<String>> res=new ArrayList<>();
        for(List<String> val:map.values()){
            res.add(val);
        }
        return res;
    }
}
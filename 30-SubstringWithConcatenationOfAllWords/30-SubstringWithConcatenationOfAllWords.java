// Last updated: 04/06/2026, 11:20:39
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res=new ArrayList<>();
        if(s.length()==0 || words.length==0)    return res;
        int len=words[0].length();
        int k=words.length;
        int tot=len*k;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        for(int i=0;i<len;i++){
            HashMap<String,Integer> window=new HashMap<>();
            int count=0,left=i;
            for(int right=i;right+len<=s.length();right+=len){
                String word=s.substring(right,right+len);
                if(map.containsKey(word)){
                    window.put(word,window.getOrDefault(word,0)+1);
                    count++;
                    while(window.get(word)>map.get(word)){
                        String leftWord=s.substring(left,left+len);
                        window.put(leftWord,window.get(leftWord)-1);
                        left+=len;
                        count--;
                    }
                    if(count==k){
                        res.add(left);
                    }
                }
                else{
                    window.clear();
                    count=0;
                    left=right+len;
                }
            }
        }
        return res;
    }
}
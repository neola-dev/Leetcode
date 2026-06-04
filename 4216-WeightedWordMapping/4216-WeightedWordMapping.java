// Last updated: 04/06/2026, 11:10:37
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        HashMap<Character,Integer> hmap=new HashMap<>();
        HashMap<Integer,Character> hmap2=new HashMap<>();
        for(int i=0;i<weights.length;i++){
            char ch=(char)('a'+i);
            hmap.put(ch,weights[i]);
        }
        for(int i=0;i<26;i++){
            hmap2.put(i,(char)('z'-i));
        }
        StringBuilder sb=new StringBuilder();
        for(String word:words){
            int sum=0;
            for(int i=0;i<word.length();i++){
                sum+=hmap.get(word.charAt(i));
            }
            int res=sum%26;
            sb.append(hmap2.get(res));
        }
        return sb.toString();
    }
}
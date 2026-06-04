// Last updated: 04/06/2026, 11:11:04
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res=new ArrayList<>();
        int ind=0;
        for(String word:words){
            if(word.indexOf(x)!=-1){
                res.add(ind);
            }
            ind++;
        }
        return res;
    }
}
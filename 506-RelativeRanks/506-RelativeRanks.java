// Last updated: 04/06/2026, 11:15:49
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] temp=score.clone();
        Arrays.sort(temp);
        int n=score.length;
        int rem=n-3;
        HashMap<Integer,String> hmap=new HashMap<>();
        for(int i=0;i<n;i++){
            if(i<rem){
                String val=String.valueOf(n-i);
                hmap.put(temp[i],val);
            }
            else if(i==rem){
                hmap.put(temp[i],"Bronze Medal");
            }
            else if(i==rem+1){
                hmap.put(temp[i],"Silver Medal");
            }
            else if(i==rem+2){
                hmap.put(temp[i],"Gold Medal");
            }
        }
        String[] res=new String[n];
        for(int i=0;i<n;i++){
            res[i]=hmap.get(score[i]);
        }
        return res;
    }
}
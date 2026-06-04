// Last updated: 04/06/2026, 11:16:39
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes,(a,b)->{
            if(a[0]==b[0]){
                return b[1]-a[1];
            }
            return a[0]-b[0];
        });
        List<Integer> ls=new ArrayList<>();
        for(int[] env:envelopes){
            int h=env[1];
            int pos=Collections.binarySearch(ls,h);
            if(pos<0)   pos=-(pos+1);
            if(ls.size()==pos){
                ls.add(h);
            }
            else{
                ls.set(pos,h);
            }
        }
        return ls.size();
    }
}
// Last updated: 04/06/2026, 11:15:23
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs=new HashSet<>();
        int n=candyType.length;
        int half=n/2;
        for(int i=0;i<n;i++){
            hs.add(candyType[i]);
            if(hs.size()==half){
                return half;
            }
        }
        return hs.size();
    }
}
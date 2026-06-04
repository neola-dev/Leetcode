// Last updated: 04/06/2026, 11:18:47
class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[] greedy=new int[n];
        Arrays.fill(greedy,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                greedy[i]=Math.max(greedy[i],greedy[i-1]+1);
            }
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
               greedy[i]=Math.max(greedy[i],greedy[i+1]+1);
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=greedy[i];
        }
        return ans;
    }
}
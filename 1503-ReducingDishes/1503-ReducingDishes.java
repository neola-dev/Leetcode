// Last updated: 04/06/2026, 11:12:38
class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n=satisfaction.length;
        int sum=0;
        int total=0;
        for(int i=n-1;i>=0;i--){
            sum+=satisfaction[i];
            if(sum<0)   break;
            total+=sum;
        }
        return total;
    }
}
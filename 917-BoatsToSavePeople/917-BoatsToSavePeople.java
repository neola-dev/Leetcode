// Last updated: 04/06/2026, 11:14:04
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n=people.length;
        int l=0;
        int r=n-1;
        int cnt=0;
        while(l<=r){
            if(people[l]+people[r]<=limit){
                cnt++;
                l++;
                r--;
            }
            else{
                cnt++;
                r--;
            }
        }
        return cnt;
    }
}
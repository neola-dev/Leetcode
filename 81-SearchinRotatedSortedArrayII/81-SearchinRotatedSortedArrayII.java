// Last updated: 14/06/2026, 17:35:03
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5    public int firstBadVersion(int n) {
6        int l=1;
7        int h=n;
8        int ans=-1;
9        while(l<=h){
10            int m=l+(h-l)/2;
11            if(isBadVersion(m)==true){
12                ans=m;
13                h=m-1;
14            }
15            else{
16                l=m+1;
17            }
18        }
19        return ans;
20    }
21}
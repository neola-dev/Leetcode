// Last updated: 14/06/2026, 17:17:42
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        int l=0;
4        int h=letters.length-1;
5        char ans=letters[0];
6        while(l<=h){
7            int m=l+(h-l)/2;
8            if(letters[m]>target){
9                ans=letters[m];
10                h=m-1;
11            }
12            else{
13                l=m+1;
14            }
15        }   
16        return ans;
17    }
18}
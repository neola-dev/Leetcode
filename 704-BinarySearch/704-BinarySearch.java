// Last updated: 14/06/2026, 15:56:10
1/** 
2 * Forward declaration of guess API.
3 * @param  num   your guess
4 * @return 	     -1 if num is higher than the picked number
5 *			      1 if num is lower than the picked number
6 *               otherwise return 0
7 * int guess(int num);
8 */
9
10public class Solution extends GuessGame {
11    public int guessNumber(int n) {
12        int l=1;
13        int h=n;
14        while(l<=h){
15            int m=l+(h-l)/2;
16            if(guess(m)==0){
17                return m;
18            }
19            else if(guess(m)==-1){
20                h=m-1;
21            }
22            else{
23                l=m+1;
24            }
25        }
26        return -1;
27    }
28}
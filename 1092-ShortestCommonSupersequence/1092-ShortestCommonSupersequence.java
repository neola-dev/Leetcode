// Last updated: 20/07/2026, 10:21:42
1class Solution {
2    public String shortestCommonSupersequence(String str1, String str2) {
3        int n=str1.length();
4        int m=str2.length();
5        int[][] dp=new int[n+1][m+1];
6        for(int i=1;i<=n;i++){
7            for(int j=1;j<=m;j++){
8                if(str1.charAt(i-1)==str2.charAt(j-1)){
9                    dp[i][j]=1+dp[i-1][j-1];
10                }
11                else{
12                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
13                }
14            }
15        }
16        System.out.print(n+m-dp[n][m]); //length of answer
17        int i=n;
18        int j=m;
19        StringBuilder sb=new StringBuilder();
20        while(i>0 && j>0){
21            if(str1.charAt(i-1)==str2.charAt(j-1)){
22                sb.append(str1.charAt(i-1));
23                i=i-1;
24                j=j-1;
25            }
26            else if(dp[i-1][j]>=dp[i][j-1]){
27                sb.append(str1.charAt(i-1));
28                i=i-1;
29            }
30            else{
31                sb.append(str2.charAt(j-1));
32                j=j-1;
33            }
34        }
35        while(i>0){
36            sb.append(str1.charAt(i-1));
37            i=i-1;
38        }
39        while(j>0){
40            sb.append(str2.charAt(j-1));
41            j=j-1;
42        }
43        return sb.reverse().toString();
44    }
45}
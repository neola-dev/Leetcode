// Last updated: 04/09/2026, 19:17:17
1class Solution {
2    public int largestPathValue(String colors, int[][] edges) {
3        int n=colors.length();
4        List<List<Integer>> adj=new ArrayList<>();
5        for(int i=0;i<n;i++){
6            adj.add(new ArrayList<>());
7        }
8        int[] indeg=new int[n];
9        for(int[] edge:edges){
10            int u=edge[0];
11            int v=edge[1];
12            indeg[v]++;
13            adj.get(u).add(v);
14        }
15        Queue<Integer> q=new LinkedList<>();
16        for(int i=0;i<n;i++){
17            if(indeg[i]==0) q.add(i);
18        }
19        int cnt=0;
20        int ans=0;
21        int[][] dp=new int[n][26];
22        while(!q.isEmpty()){
23            int curr=q.poll();
24            cnt++;
25            int color=colors.charAt(curr)-'a';
26            dp[curr][color]++;
27            ans=Math.max(ans,dp[curr][color]);
28            for(int nei:adj.get(curr)){
29                for(int i=0;i<26;i++){
30                    dp[nei][i]=Math.max(dp[curr][i],dp[nei][i]);
31                }
32                indeg[nei]--;
33                if(indeg[nei]==0){
34                    q.add(nei);
35                }
36            }
37        }
38        if(cnt!=n) return -1;
39        return ans;
40    }
41}
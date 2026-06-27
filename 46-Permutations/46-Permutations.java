// Last updated: 27/06/2026, 11:39:00
1class Solution {
2    public void recur(char[] arr,List<String> res,int n,boolean[] vis,StringBuilder sb){
3        if(sb.length()==n){
4            res.add(sb.toString());
5            return;
6        }
7        for(int i=0;i<arr.length;i++){
8            if(vis[i])  continue;
9            sb.append(arr[i]);
10            vis[i]=true;
11            recur(arr,res,n,vis,sb);
12            vis[i]=false;
13            sb.deleteCharAt(sb.length()-1);
14        }
15    }
16    public String getPermutation(int n, int k) {
17        char[] arr=new char[n];
18        for(int i=0;i<n;i++){
19            arr[i]=(char)((i+1)+'0');
20        }
21        List<String> res=new ArrayList<>();
22        boolean[] vis=new boolean[n];
23        recur(arr,res,n,vis,new StringBuilder());
24        return res.get(k-1);
25    }
26}
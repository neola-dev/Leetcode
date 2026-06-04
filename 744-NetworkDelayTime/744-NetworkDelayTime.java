// Last updated: 04/06/2026, 11:14:43
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] res=new int[n+1];
        Arrays.fill(res,Integer.MAX_VALUE);
        res[k]=0;
        Map<Integer,ArrayList<int[]>> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int[] arr:times){
            int u=arr[0];
            int v=arr[1];
            int wgt=arr[2];
            map.get(u).add(new int[]{v,wgt});
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[1]));
        pq.add(new int[]{k,0});
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int u=curr[0];
            int w=curr[1];
            if(res[u]<w){
                continue;
            }
            for(int[] c:map.get(u)){
                int v=c[0];
                int wgt=c[1];
                if(res[u]!=Integer.MAX_VALUE && res[u]+wgt<res[v]){
                    res[v]=res[u]+wgt;
                    pq.add(new int[]{v,res[v]});
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            if(res[i]==Integer.MAX_VALUE)       return -1;
            if(res[i]>max)  max=Math.max(max,res[i]);
        }
        return max;
    }
}
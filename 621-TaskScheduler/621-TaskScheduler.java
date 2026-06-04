// Last updated: 04/06/2026, 11:15:13
class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:tasks){
            map.put(c,map.getOrDefault(c,0)+1);
        }  
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(map.values());
        int time=0;
        while(!pq.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            int cnt=n+1;
            while(cnt>0 && !pq.isEmpty()){
                int freq=pq.poll();
                time++;
                if(freq>1){
                    temp.add(freq-1);
                }
                cnt--; //number of elements in each cycle is getting reduced
            }
            //put rem freq in pq to allocate all tasks
            for(int rem:temp){
                pq.add(rem);
            }
            //to add idle time we will have rem elemts in pq so add cnt
            if(!pq.isEmpty()){
                time+=cnt;
            }
        }
        return time;
    }
}
// Last updated: 09/06/2026, 11:48:37
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3       List<Integer> res=new ArrayList<>();
4       Deque<Integer> dq=new LinkedList<>();
5       for(int i=0;i<nums.length;i++){
6            while(!dq.isEmpty() && dq.peekFirst()<=i-k) dq.pollFirst();
7            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]) dq.pollLast();
8            dq.offerLast(i);
9            if(i>=k-1)  res.add(nums[dq.peekFirst()]);
10       } 
11       int[] ans=new int[res.size()];
12       for(int i=0;i<res.size();i++){
13            ans[i]=res.get(i);
14       }
15       return ans;
16    }
17}
// Last updated: 11/06/2026, 11:59:21
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        int n=nums2.length;
5        Stack<Integer> st=new Stack<>();
6        for(int i=n-1;i>=0;i--){
7            while(!st.isEmpty() && nums2[i]>nums2[st.peek()]){
8                st.pop();
9            }
10            int val=st.isEmpty()?-1:nums2[st.peek()];
11            map.put(nums2[i],val);
12            st.push(i);
13        }
14        int[] ans=new int[nums1.length];
15        for(int i=0;i<nums1.length;i++){
16            ans[i]=map.get(nums1[i]);
17        }
18        return ans;
19    }
20}
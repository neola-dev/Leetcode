// Last updated: 04/06/2026, 11:15:56
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] nge=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums2[st.peek()]<nums2[i]){
                st.pop();
            }
            nge[i]=st.isEmpty()?-1:nums2[st.peek()];
            map.put(nums2[i],nge[i]);
            st.push(i);
        }
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }
        return res;
    }
}
// Last updated: 04/06/2026, 11:10:41
class Solution {
    public long countSubarrays(int[] nums, long k) {
        Deque<Integer> minDq=new ArrayDeque<>();
        Deque<Integer> maxDq=new ArrayDeque<>();
        long ans=0;
        int left=0,right=0;
        int n=nums.length;
        while(right<n){
            while(!maxDq.isEmpty() && nums[maxDq.peekLast()]<=nums[right]){
                maxDq.pollLast();
            }
            maxDq.add(right);
            while(!minDq.isEmpty() && nums[minDq.peekLast()]>=nums[right]){
                minDq.pollLast();
            }
            minDq.add(right);
            //shrink window when cost>k
            while((long)(nums[maxDq.peekFirst()]-nums[minDq.peekFirst()])*(right-left+1)>k){
                if(minDq.peekFirst()==left) minDq.pollFirst();
                if(maxDq.peekFirst()==left) maxDq.pollFirst();
                left++;
            }
            ans+=(right-left+1);
            right++;
        }
        return ans;
    }
}
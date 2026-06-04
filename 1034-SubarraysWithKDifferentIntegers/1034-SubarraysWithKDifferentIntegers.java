// Last updated: 04/06/2026, 11:13:43
class Solution {
    public int find(int[] nums,int k){
        int l=0;
      int r=0;
      int n=nums.length;
      int cnt=0;
      HashMap<Integer,Integer> hmap=new HashMap<>();
      while(r<n){
         int numR=nums[r];
         hmap.put(numR,hmap.getOrDefault(numR,0)+1);
         while(hmap.size()>k){
            int numL=nums[l];
            hmap.put(numL,hmap.getOrDefault(numL,0)-1);
            if(hmap.get(numL)==0)    hmap.remove(numL);
            l++;
         }
         if(hmap.size()<=k) cnt+=(r-l+1);
         r++;
      }   
      return cnt;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
      return find(nums,k)-find(nums,k-1);
    }
}
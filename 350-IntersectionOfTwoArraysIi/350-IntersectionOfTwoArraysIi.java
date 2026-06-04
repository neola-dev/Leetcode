// Last updated: 04/06/2026, 11:16:41
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        ArrayList<Integer> list=new ArrayList<>();
        boolean[] used=new boolean[n2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(!used[j] && nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                    used[j]=true;
                    break;
                }
            }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
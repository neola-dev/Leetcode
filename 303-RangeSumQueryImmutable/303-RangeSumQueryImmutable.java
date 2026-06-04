// Last updated: 04/06/2026, 11:16:57
class NumArray {
    int[] arr;
    public NumArray(int[] nums) {
        arr=nums;
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        int[] pre=new int[arr.length];
        for(int i=left;i<=right;i++){
            if(i!=0) pre[i]=arr[i]+pre[i-1];
            else    pre[i]=arr[i];
        }
        return pre[right];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
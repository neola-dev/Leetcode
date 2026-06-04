// Last updated: 04/06/2026, 11:12:41
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> hset=new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int num=arr[i];
            if(hset.contains(num*2) || (num%2==0 && hset.contains(num/2))){
                return true;
            }
            hset.add(num);
        }
        return false;
    }
}
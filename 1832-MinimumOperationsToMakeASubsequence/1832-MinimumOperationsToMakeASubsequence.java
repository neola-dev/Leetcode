// Last updated: 04/06/2026, 11:12:09
class Solution {
    public int minOperations(int[] target, int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<target.length;i++){
            map.put(target[i],i);
        }
        List<Integer> ls=new ArrayList<>();
        for(int num:arr){
            if(!map.containsKey(num))   continue;
            int ind=map.get(num);
            int pos=Collections.binarySearch(ls,ind);
            if(pos<0)   pos=-(pos+1);
            if(pos==ls.size())  ls.add(ind);
            else ls.set(pos,ind);
        }
        return target.length-ls.size();
    }
}
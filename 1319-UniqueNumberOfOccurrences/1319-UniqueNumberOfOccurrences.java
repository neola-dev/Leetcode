// Last updated: 04/06/2026, 11:13:03
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<n;i++){
            hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> hset=new HashSet<>();
        for(int i:hmap.keySet()){
            int occ=hmap.get(i);
            if(hset.contains(occ)){
                return false;
            }
            hset.add(occ);
        }
        return true;
    }
}
// Last updated: 04/06/2026, 11:15:19
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> hmap=new HashMap<>();
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            hmap.put(list1[i],i);
        }
        int min=Integer.MAX_VALUE;
        for(int j=0;j<list2.length;j++){
            if(hmap.containsKey(list2[j])){
                int sum=hmap.get(list2[j])+j;
                if (sum < min) {
                    al.clear();            
                    al.add(list2[j]);
                    min = sum;    
                } else if (sum == min) {
                    al.add(list2[j]);     
                }
            }
        }
        return al.toArray(new String[0]);
    }
}
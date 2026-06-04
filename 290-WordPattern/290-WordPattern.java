// Last updated: 04/06/2026, 11:17:05
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hmap=new HashMap<>();
        Set<String> hset=new HashSet<>();
        String[] arr=s.split(" ");
        if(pattern.length()!=arr.length)    return false;
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(hmap.containsKey(ch)){
                if(!hmap.get(ch).equals(arr[i])){
                    return false;
                }
            }
            else{
                if(hset.contains(arr[i])){
                    return false;
                }
                hmap.put(ch,arr[i]);
                hset.add(arr[i]);
            }
        }
        return true;
    }
}
// Last updated: 05/06/2026, 13:17:35
1class Solution {
2    public boolean closeStrings(String word1, String word2) {
3        HashMap<Character,Integer> map1=new HashMap<>();
4        HashMap<Character,Integer> map2=new HashMap<>();
5        for(char ch:word1.toCharArray()){
6            map1.put(ch,map1.getOrDefault(ch,0)+1);
7        }
8        for(char ch:word2.toCharArray()){
9            map2.put(ch,map2.getOrDefault(ch,0)+1);
10        }
11        if(!map1.keySet().equals(map2.keySet()))    return false;
12        List<Integer> list1=new ArrayList<>();
13        for(int val:map1.values())  list1.add(val);
14        List<Integer> list2=new ArrayList<>();
15        for(int val:map2.values())  list2.add(val);
16        Collections.sort(list1);
17        Collections.sort(list2);
18        return list1.equals(list2);
19    }
20}
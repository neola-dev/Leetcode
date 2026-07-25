// Last updated: 25/07/2026, 09:18:13
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        List<List<String>> res=new ArrayList<>();
4        HashMap<String,List<String>> map=new HashMap<>();
5        for(int i=0;i<strs.length;i++){
6            String word=strs[i];
7            int[] freq=new int[26];
8            for(int j=0;j<word.length();j++){
9                char ch=word.charAt(j);
10                freq[ch-'a']++;
11            }
12            StringBuilder key=new StringBuilder();
13            for(int j=0;j<26;j++){
14                key.append(freq[j]);
15                key.append('#');
16            }
17            String keyStr=key.toString();
18            if(map.containsKey(keyStr)){
19                map.get(keyStr).add(word);
20            }
21            else{
22                map.put(keyStr,new ArrayList<>());
23                map.get(keyStr).add(word);
24            }
25        }
26        for(List<String> pairs:map.values()){
27            res.add(pairs);
28        }
29        return res;
30    }
31}
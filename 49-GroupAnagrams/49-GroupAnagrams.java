// Last updated: 07/09/2026, 15:22:07
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        List<List<String>> res=new ArrayList<>();
4        HashMap<String,List<String>> map=new HashMap<>();
5        for(int i=0;i<strs.length;i++){
6            String word=strs[i];
7            int[] freq=new int[26];
8            for(int j=0;j<word.length();j++){
9                freq[word.charAt(j)-'a']++;
10            }
11            StringBuilder sb=new StringBuilder();
12            for(int j=0;j<26;j++){
13                sb.append(freq[j]);
14                sb.append('#');
15            }
16            if(map.containsKey(sb.toString())){
17                map.get(sb.toString()).add(word);
18            }
19            else{
20                map.put(sb.toString(),new ArrayList<>());
21                map.get(sb.toString()).add(word);
22            }
23        }
24        for(List<String> pairs:map.values()){
25            res.add(pairs);
26        }
27        return res;
28    }
29}
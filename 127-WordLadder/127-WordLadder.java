// Last updated: 30/06/2026, 21:05:19
1class Solution {
2    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
3        Set<String> set=new HashSet<>(wordList);
4        if(!set.contains(endWord))  return 0;
5        Queue<Pair<String,Integer>> q=new LinkedList<>();
6        q.add(new Pair<>(beginWord,1));
7        while(!q.isEmpty()){
8            Pair<String,Integer> curr=q.poll();
9            String word=curr.getKey();
10            int steps=curr.getValue();
11            if(word.equals(endWord)){
12                return steps;
13            }
14            char[] arr=word.toCharArray();
15            for(int i=0;i<arr.length;i++){
16                char org=arr[i];
17                for(char c='a';c<='z';c++){
18                    arr[i]=c;
19                    String newWord=new String(arr);
20                    if(set.contains(newWord)){
21                        q.add(new Pair<>(newWord,steps+1));
22                        set.remove(newWord);
23                    }
24                }
25                arr[i]=org;
26            }
27        }
28        return 0;
29    }
30}
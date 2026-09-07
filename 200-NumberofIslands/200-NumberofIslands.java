// Last updated: 07/09/2026, 13:56:20
1class Pair{
2    String word;
3    int steps;
4    Pair(String w,int s){
5        this.word=w;
6        this.steps=s;
7    }
8}
9class Solution {
10    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
11        Set<String> set=new HashSet<>(wordList);
12        if(!set.contains(endWord)) return 0;
13        Queue<Pair> q=new LinkedList<>();
14        q.add(new Pair(beginWord,1));
15        while(!q.isEmpty()){
16            Pair curr=q.poll();
17            String word=curr.word;
18            int steps=curr.steps;
19            if(word.equals(endWord)){
20                return steps;
21            }
22            char[] arr=word.toCharArray();
23            for(int i=0;i<arr.length;i++){
24                char org=arr[i];
25                for(char c='a';c<='z';c++){
26                    arr[i]=c;
27                    String newWord=new String(arr);
28                    if(set.contains(newWord)){
29                        q.add(new Pair(newWord,steps+1));
30                        set.remove(newWord);
31                    }
32                }
33                arr[i]=org;
34            }
35        }
36        return 0;
37    }
38}
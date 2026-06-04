// Last updated: 04/06/2026, 11:18:55
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
       Set<String> set=new HashSet<>(wordList);
       if(!set.contains(endWord))  return 0;
       Queue<Pair<String,Integer>> q=new LinkedList<>();
       q.add(new Pair<>(beginWord,1));
       while(!q.isEmpty()){
         Pair<String,Integer> p=q.poll();
         String word=p.getKey();
         int steps=p.getValue();
         if(word.equals(endWord)){
            return steps;
         }
         char[] arr=word.toCharArray();
         for(int i=0;i<arr.length;i++){
            char org=arr[i];
            for(char c='a';c<='z';c++){
                arr[i]=c;
                String newWord=new String(arr);
                if(set.contains(newWord)){
                    q.add(new Pair<>(newWord,steps+1));
                    set.remove(newWord);
                }
            }
            arr[i]=org;
         }
       }
       return 0;
    }
}
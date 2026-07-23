// Last updated: 23/07/2026, 12:39:57
1class Node{
2   Node[] links=new Node[26];
3   boolean flag=false;
4   boolean containsKey(char ch){
5     return (links[ch-'a']!=null);
6   }
7   void put(char ch,Node newNode){
8     links[ch-'a']=newNode;
9   }
10   Node get(char ch){
11    return links[ch-'a'];
12   }
13   void setEnd(){
14     flag=true;
15   }
16   boolean isEnd(){
17    return flag;
18   }
19}
20class Trie {
21    Node root;
22    public Trie() {
23        root=new Node();
24    }
25    
26    public void insert(String word) {
27        Node node=root;
28        for(int i=0;i<word.length();i++){
29            if(!node.containsKey(word.charAt(i))){
30                node.put(word.charAt(i),new Node());
31            }
32            node=node.get(word.charAt(i));
33        }
34        node.setEnd();
35    }
36    
37    public boolean search(String word) {
38        Node node=root;
39        for(int i=0;i<word.length();i++){
40            if(!node.containsKey(word.charAt(i))){
41                return false;
42            }
43            node=node.get(word.charAt(i));
44        }
45        if(node.isEnd()) return true;
46        return false;
47    }
48    
49    public boolean startsWith(String prefix) {
50        Node node=root;
51        for(int i=0;i<prefix.length();i++){
52            if(!node.containsKey(prefix.charAt(i))){
53                return false;
54            }
55            node=node.get(prefix.charAt(i));
56        }
57        return true;
58    }
59}
60
61/**
62 * Your Trie object will be instantiated and called as such:
63 * Trie obj = new Trie();
64 * obj.insert(word);
65 * boolean param_2 = obj.search(word);
66 * boolean param_3 = obj.startsWith(prefix);
67 */
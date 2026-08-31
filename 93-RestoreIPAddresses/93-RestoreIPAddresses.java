// Last updated: 31/08/2026, 12:35:41
1class LRUCache {
2    class Node{
3        int key;
4        int val;
5        Node next;
6        Node prev;
7        Node(int k,int v){
8            this.key=k;
9            this.val=v;
10        }
11    }
12    public void deleteNode(Node node){
13        Node prevNode=node.prev;
14        Node nextNode=node.next;
15        prevNode.next=nextNode;
16        nextNode.prev=prevNode;
17    }
18    public void insertAfterHead(Node node){
19        Node currAfterHead=head.next;
20        node.next=currAfterHead;
21        head.next=node;
22        currAfterHead.prev=node;
23        node.prev=head;
24    }
25    Node head=new Node(-1,-1);
26    Node tail=new Node(-1,-1);
27    int cap;
28    HashMap<Integer,Node> map=new HashMap<>();
29    public LRUCache(int capacity) {
30        cap=capacity;
31        head.next=tail;
32        tail.prev=head;
33    }
34    
35    public int get(int key) {
36        if(map.containsKey(key)){
37            Node resNode=map.get(key);
38            map.remove(key);
39            deleteNode(resNode);
40            insertAfterHead(resNode);
41            map.put(key,head.next);
42            return resNode.val;
43        }
44        return -1;
45    }
46    
47    public void put(int key, int value) {
48        if(map.containsKey(key)){
49            Node resNode=map.get(key);
50            resNode.val=value;
51            deleteNode(resNode);
52            insertAfterHead(resNode);
53        }
54        else{
55            if(map.size()==cap){
56                Node resNode=tail.prev;
57                map.remove(resNode.key);
58                deleteNode(resNode);
59            }
60            Node newNode=new Node(key,value);
61            map.put(key,newNode);
62            insertAfterHead(newNode);
63        }
64    }
65}
66
67/**
68 * Your LRUCache object will be instantiated and called as such:
69 * LRUCache obj = new LRUCache(capacity);
70 * int param_1 = obj.get(key);
71 * obj.put(key,value);
72 */
// Last updated: 17/06/2026, 18:19:19
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeKLists(ListNode[] lists) {
13        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
14        for(ListNode node:lists){
15            if(node!=null){
16                pq.add(node);
17            }
18        }
19        ListNode dum=new ListNode(-1);
20        ListNode curr=dum;
21        while(!pq.isEmpty()){
22            ListNode smallest=pq.poll();
23            curr.next=smallest;
24            curr=curr.next;
25            if(smallest.next!=null){
26                pq.add(smallest.next);
27            }
28        }
29        return dum.next;
30    }
31}
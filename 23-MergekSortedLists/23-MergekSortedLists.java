// Last updated: 18/06/2026, 09:16:16
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
15            if(node!=null)   pq.add(node);
16        }
17        ListNode dumm=new ListNode(-1);
18        ListNode curr=dumm;
19        while(!pq.isEmpty()){
20            ListNode small=pq.poll();
21            curr.next=small;
22            curr=curr.next;
23            if(small.next!=null){
24                pq.add(small.next);
25            }
26        }
27        return dumm.next;
28    }
29}
// Last updated: 17/06/2026, 15:56:43
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode fast=head;
14        for(int i=0;i<n;i++){
15            fast=fast.next;
16        }
17        if(fast==null)  return head.next;
18        ListNode slow=head;
19        while(fast.next!=null){
20            slow=slow.next;
21            fast=fast.next;
22        }
23        slow.next=slow.next.next;
24        return head;
25    }
26}
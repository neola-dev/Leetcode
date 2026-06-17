// Last updated: 17/06/2026, 14:08:54
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
12    public ListNode reverseKGroup(ListNode head, int k) {
13        if(head==null || k==1){
14            return head;
15        }
16        ListNode curr=head;
17        for(int i=0;i<k;i++){
18            if(curr==null)  return head;
19            curr=curr.next;
20        }
21        ListNode prev=null;
22        curr=head;
23        for(int i=0;i<k;i++){
24            ListNode nextNode=curr.next;
25            curr.next=prev;
26            prev=curr;
27            curr=nextNode;
28        }
29        head.next=reverseKGroup(curr,k);
30        return prev;
31    }
32}
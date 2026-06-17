// Last updated: 17/06/2026, 13:38:09
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
12    public ListNode rotateRight(ListNode head, int k) {
13        if(head==null || k==0) return head;
14        ListNode temp=head;
15        int n=1;
16        while(temp.next!=null){
17            n++;
18            temp=temp.next;
19        }
20        temp.next=head;
21        k=k%n;
22        int steps=n-k;
23        ListNode newTail=head;
24        for(int i=1;i<steps;i++){
25            newTail=newTail.next;
26        }
27        ListNode newHead=newTail.next;
28        newTail.next=null;
29        return newHead;
30    }
31}
// Last updated: 16/06/2026, 13:28:25
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
12    public void reorderList(ListNode head) {
13        ListNode temp=head;
14        ListNode slow=head;
15        ListNode fast=head;
16        while(fast!=null && fast.next!=null){
17            slow=slow.next;
18            fast=fast.next.next;
19        }
20        ListNode first=head;
21        ListNode sec=reverse(slow.next);
22        slow.next=null;
23        ListNode temp1=first;
24        ListNode temp2=sec;
25        while(temp1!=null && temp2!=null){
26            ListNode t1next=temp1.next;
27            ListNode t2next=temp2.next;
28            temp1.next=temp2;
29            temp2.next=t1next;
30            temp1=t1next;
31            temp2=t2next;
32        }
33    }
34    public ListNode reverse(ListNode head){
35        ListNode temp=head;
36        ListNode prev=null;
37        while(temp!=null){
38            ListNode next=temp.next;
39            temp.next=prev;
40            prev=temp;
41            temp=next;
42        }
43        return prev;
44    }
45}
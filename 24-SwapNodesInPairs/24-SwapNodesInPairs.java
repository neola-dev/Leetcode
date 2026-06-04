// Last updated: 04/06/2026, 11:20:48
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode  dum=new ListNode(-1);
        dum.next=head;
        ListNode temp=dum;
        while(temp.next!=null && temp.next.next!=null){
            ListNode swap1=temp.next;
            ListNode swap2=temp.next.next;
            swap1.next=swap2.next;
            swap2.next=swap1;
            temp.next=swap2;
            temp=swap1;
        }
        return dum.next;
    }
}
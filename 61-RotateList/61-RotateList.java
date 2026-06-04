// Last updated: 04/06/2026, 11:20:01
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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null)  return head;
        int n=1;
        ListNode temp=head;
        while(temp.next!=null){
            n++;
            temp=temp.next;
        }
        temp.next=head;
        k=k%n;
        ListNode newTail=head;
        int steps=n-k;
        for(int i=1;i<steps;i++){
            newTail=newTail.next;
        }
        ListNode newHead=newTail.next;
        newTail.next=null;
        return newHead;
    }
}
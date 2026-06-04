// Last updated: 04/06/2026, 11:12:55
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
    public int getDecimalValue(ListNode head) {
        int sum=0;
        int val=1;
        ListNode temp=head;
        while(temp!=null){
            sum=sum*2+temp.val;
            temp=temp.next;
        }
        return sum;
    }
}
// Last updated: 04/06/2026, 11:20:52
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode dup=new ListNode(-1);
        ListNode temp=dup;
        while(temp1!=null || temp2!=null){
            if(temp1!=null && temp2!=null){
                if(temp1.val<=temp2.val){
                    dup.next=temp1;
                    dup=dup.next;
                    temp1=temp1.next;
                }
                else{
                    dup.next=temp2;
                    dup=dup.next;
                    temp2=temp2.next;
                }
            }
            else{
                if(temp1!=null){
                    dup.next=temp1;
                    dup=dup.next;
                    temp1=temp1.next;
                }
                else{
                    dup.next=temp2;
                    dup=dup.next;
                    temp2=temp2.next;
                }
            }
        }
        return temp.next;
    }
}
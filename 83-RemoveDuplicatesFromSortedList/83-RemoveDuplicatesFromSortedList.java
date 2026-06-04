// Last updated: 04/06/2026, 11:19:37
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
    public ListNode deleteDuplicates(ListNode head) {
      /*HashSet<Integer> hs=new HashSet<>();
      Node temp=head;
      Node prev=null;
      while(temp!=null){
        if(hs.contains(temp.val)){
            prev.next=temp.next;
        }
        hs.add(temp.val);
        temp=temp.next;
        prev=temp;
      }   
      return head;*/
      if(head==null || head.next==null) return head;
      ListNode temp=head;
      while(temp.next!=null){
        if(temp.val==temp.next.val){
            temp.next=temp.next.next;
        }
        else    temp=temp.next;
      }
      return head;
    }
}
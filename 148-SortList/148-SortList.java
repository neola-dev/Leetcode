// Last updated: 04/06/2026, 11:18:35
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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> arrList=new ArrayList<>();
        ListNode temp=head;
        if(head==null || head.next==null)   return head;
        while(temp!=null){
            arrList.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(arrList);
        ListNode tem=head;
        int i=0;
        while(tem!=null){
            tem.val=arrList.get(i);
            i=i+1;
            tem=tem.next;
        }
        return head;
    }
}
// Last updated: 04/06/2026, 11:13:33
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
    public int[] nextLargerNodes(ListNode head) {
       ArrayList<Integer> al=new ArrayList<>();
       ListNode temp=head;
       int len=0;
       while(temp!=null){
            al.add(temp.val);
            len++;
            temp=temp.next;
       } 
       Stack<Integer> st=new Stack<>();
       int[] res=new int[len];
       for(int i=0;i<len;i++){
            int currElmt=al.get(i);
            while(!st.empty() && al.get(st.peek())<currElmt){
                int indx=st.pop();
                res[indx]=currElmt;
            }
            st.push(i);
       }
       return res;
    }
}
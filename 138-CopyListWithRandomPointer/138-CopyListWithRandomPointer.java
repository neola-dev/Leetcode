// Last updated: 04/06/2026, 11:18:43
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node createCopy(Node head){
        Node temp=head;
        while(temp!=null){
            Node copyNode=new Node(temp.val);
            copyNode.next=temp.next;
            temp.next=copyNode;
            temp=temp.next.next;
        }
        return head;
    }
    public Node randomConnect(Node head){
        Node curr=head;
        while(curr!=null){
            if(curr.random!=null)  curr.next.random=curr.random.next;
            else    curr.next.random=null;
            curr=curr.next.next;
        }
        return head;
    }
    public Node nextConnect(Node head){
        Node temp=head;
        Node dummy=new Node(-1);
        Node res=dummy;
        while(temp!=null){
            res.next=temp.next;
            res=res.next;
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return dummy.next;
    }
    public Node copyRandomList(Node head) {
        createCopy(head);
        randomConnect(head);
        return nextConnect(head);
    }
}
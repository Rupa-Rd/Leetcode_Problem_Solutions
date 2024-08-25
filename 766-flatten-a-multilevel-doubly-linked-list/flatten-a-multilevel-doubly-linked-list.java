/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null)
            return head;
        Node temp = head;
        
        while(temp != null){
            if(temp.child == null){
                temp = temp.next;
                continue;
            }
            Node childNode = temp.child;
            while(childNode.next != null){
                childNode = childNode.next;
            }
            childNode.next = temp.next;
            if(temp.next != null)
                temp.next.prev = childNode;
            
            temp.next = temp.child;
            temp.child.prev = temp;
            temp.child = null;
        }
        
        return head;
    }
    
}
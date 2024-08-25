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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sizeOfLL = size(head) - n;
        if(sizeOfLL == 0){
            head = head.next;
            return head;
        }
            
        ListNode temp = head;
        System.out.println(sizeOfLL);
        while(sizeOfLL > 1){
            temp = temp.next;
            sizeOfLL --;
        }
        
        System.out.println(temp.val + " " + temp.next.val);
        ListNode nextNode = null;
        if(temp.next != null)
            nextNode = temp.next;
        temp.next = nextNode.next;
        
        return head;
    }
    public int size(ListNode head){
        int s = 0;
        
        while(head != null){
            s++;
            head = head.next;
        }
        
        return s;
    }
}
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
    public ListNode middleNode(ListNode head) {
        int length = size(head);
        int mid = length / 2 + 1;
        
        ListNode temp = head;
        while(mid != 1){
            temp = temp.next;
            mid --;
        }
        
        return temp;
    }
    public int size(ListNode head){
        int length = 0;
        
        while(head != null){
            head = head.next;
            length ++;
        }
        return length;
    }
}
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
    public ListNode removeElements(ListNode head, int val) {
//         if(head == null)
//             return head;
        
//         // CHeck for head values
//         while(head != null && head.val == val){
//             System.out.println(head.val);
//             head = head.next;
//         }
//         ListNode temp = head;
//         if(temp == null || temp.next == null)
//             return head;
//         // In between values
//         while(temp != null && temp.next != null){
//             if(temp.next.val == val){
//                 temp.next = temp.next.next;
//             }else{
//                 temp = temp.next;    
//             }
            
//         }
        
//         return head;
        if(head == null)
            return null;
        
        head.next = removeElements(head.next, val);
        
        if(head.val == val){
            return head.next;
        }else{
            return head;
        }
    }
}
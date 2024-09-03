/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Bruteforce method to check for each node : O(N^2)
        if(head == null)
            return false;
        // Optimized using set
        Set<ListNode> set = new HashSet<>();
        while(head != null){
            if(set.contains(head)){
                return true;
            }
            set.add(head);
            head = head.next;
        }
        
        return false;
    }
    public boolean isCycle(ListNode head){
        ListNode temp = head;
        
        while(temp.next != null){
            if(temp.next == head){
                return true;
            }
            temp = temp.next;
        }
        
        return false;
    }
}
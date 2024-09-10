class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
//         ListNode dummy = new ListNode(-1);
//         dummy.next = head;
//         ListNode prev = dummy;
        
//         while (prev.next != null && prev.next.next != null) {
//             // Nodes to be swapped
//             ListNode first = prev.next;
//             ListNode second = prev.next.next;
            
//             // Swap the nodes
//             first.next = second.next;
//             second.next = first;
//             prev.next = second;
            
//             // Move the pointer
//             prev = first;
//         }
        
//         return dummy.next;
        ListNode first = head;
        ListNode second = head.next;
        
        first.next = swapPairs(second.next);
        
        second.next = first;
        
        return second;
        
    }
}

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
    public ListNode reverseList(ListNode head) {
        // Bruteforce using extra space
//         ArrayList<Integer> values = new ArrayList<>();
        
//         ListNode temp = head;
        
//         while(temp != null){
//             values.add(temp.val);
//             temp = temp.next;
//         }
        
//         Collections.sort(values, Collections.reverseOrder());
//         temp = head;
//         int i = 0;
//         while(temp != null && i < values.size()){
//             temp.val = values.get(i);
//             i++;
//             temp = temp.next;
//         }
        
//         return head;
        
        // Bruteforce using Stack data structure
        
//         Stack<Integer> values = new Stack<>();
//         ListNode temp = head;
        
//         while(temp != null){
//             values.push(temp.val);
//             temp = temp.next;
//         }
        
//         temp = head;
        
//         while(temp != null){
//             temp.val = values.pop();
//             temp = temp.next;
//         }
        
//         return head;
        
        // Optimized iterative solution
        ListNode prev = null, temp = head;
        
        while(temp != null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            
            
        }
        
        return prev;
    }
}
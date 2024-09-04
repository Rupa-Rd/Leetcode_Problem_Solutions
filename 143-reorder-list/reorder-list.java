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
    public void reorderList(ListNode head) {
        // Bruteforce: TC- O(N), SC- O(N)
//         ArrayList<ListNode> arr = new ArrayList<>();
//         ListNode temp = head;
        
//         while(temp != null){
//             arr.add(temp);
//             temp = temp.next;
//         }
        
//         int i =0, j = arr.size() - 1;
        
//         while(i < j){
//             arr.get(i).next = arr.get(j);
//             i++;
//             if(i == j)
//                 break;
//             arr.get(j).next = arr.get(i);
//             j--;
//         }
//         arr.get(i).next = null;
        
        // Optimal solution: TC - O(N), SC - O(1)
    if (head == null || head.next == null) return;

        // Step 1: Find the middle of the list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half
        ListNode prev = null, curr = slow, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        // Step 3: Merge the two halves
        ListNode first = head, second = prev;
        while (second.next != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
    }
}
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
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return head;
        }

        ListNode slowPointer = head, fastPointer = head;

        while(fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if(slowPointer == fastPointer){
                ListNode startNode = head;

                while(startNode != slowPointer){
                    startNode = startNode.next;
                    slowPointer = slowPointer.next;
                }

                return slowPointer;
            }
        }

        return null;
    }
}
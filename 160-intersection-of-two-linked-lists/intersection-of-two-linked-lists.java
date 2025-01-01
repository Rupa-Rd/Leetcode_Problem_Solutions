/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // TC: O(len(headA) + len(headB)), SC: O(len(headA) + len(headB))
        Set<ListNode> intersection = new HashSet<>();
        ListNode tempHeadA = headA;
        while(tempHeadA != null){
            intersection.add(tempHeadA);
            tempHeadA = tempHeadA.next;
        }

        ListNode tempHeadB = headB;
        while(tempHeadB != null){
            if(intersection.contains(tempHeadB)){
                return tempHeadB;
            }
            tempHeadB = tempHeadB.next;
        }

        return null;
    }
}
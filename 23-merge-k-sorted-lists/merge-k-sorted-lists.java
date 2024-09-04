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
    public ListNode mergeKLists(ListNode[] lists) {
        // Bruteforce: O(n logn)
//         PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        
//         for(ListNode temp: lists){
//             while(temp != null){
//                 pq.add(temp);
//                 temp = temp.next;
//             }
//         }
        
//         ListNode head = new ListNode(-1);
//         ListNode dummy = head;
        
//         while(!pq.isEmpty()){
//             dummy.next = pq.remove();
//             dummy = dummy.next;
//         }
        
//         dummy.next = null;
//         return head.next;
        // Optimal solution: O(n Log k)
        if(lists == null || lists.length == 0)
            return null;
        return mergeLists(lists, 0, lists.length - 1);
    }
    public ListNode mergeLists(ListNode[] lists, int left, int right){
        if(left == right)
            return lists[left];
        int mid = left + (right - left) / 2;
        
        ListNode l1 = mergeLists(lists, left, mid);
        ListNode l2 = mergeLists(lists, mid + 1, right);
        
        return merge(l1, l2);
    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode head = new ListNode(-1);
        ListNode dummy = head;
        
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                dummy.next = l1;
                l1 = l1.next;
            }else{
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }
        
        if(l1 != null){
            dummy.next = l1;
        }if(l2 != null){
            dummy.next = l2;
        }
        
        return head.next;
    }
}
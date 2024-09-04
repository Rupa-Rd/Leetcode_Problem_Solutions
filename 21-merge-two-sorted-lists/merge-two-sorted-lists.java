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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        
        while(list1 != null){
            pq.add(list1);
            list1 = list1.next;
        }
        
        while(list2 != null){
            pq.add(list2);
            list2 = list2.next;
        }
        ListNode newHead = new ListNode(0);
        ListNode temp = newHead;
        
        while(!pq.isEmpty()){
            temp.next = pq.remove();
            temp = temp.next;
        }
        
        temp.next = null;
        return newHead.next;
    
//         if(list1 == null)
//             return list2;
//         if(list2 == null)
//             return list1;
        
//         if(list1.val < list2.val){
//             list1.next = mergeTwoLists(list1.next, list2);
//             return list1;
//         }else{
//             list2.next = mergeTwoLists(list1, list2.next);
//             return list2;
//         }
            
            
    }
}
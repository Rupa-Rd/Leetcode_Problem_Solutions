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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        Set<Integer> set = new HashSet<>(); 
        
        for(int i: nums)
            set.add(i);
        System.out.println(set);
        // check for head values
        while(head != null){
            if(set.contains(head.val))
                head = head.next;
            else
                break;
        }
        
        ListNode temp = head;
        while(temp.next != null){
            if(set.contains(temp.next.val)){
                ListNode next = temp.next.next;
                temp.next = next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
}
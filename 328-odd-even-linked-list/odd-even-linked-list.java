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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        // ArrayList<ListNode> odd = new ArrayList<>();
        // ArrayList<ListNode> even = new ArrayList<>();
        // int index = 0;

        // while(head != null){
        //     if(index % 2 == 0){
        //         even.add(head);
        //     }else{
        //         odd.add(head);
        //     }
        //     head = head.next;
        //     index++;
        // }

        // ListNode newHead = new ListNode(0);
        // ListNode temp = newHead;

        // for(ListNode node: even){
        //     temp.next = node;
        //     temp = temp.next;
        // }

        // for(ListNode node: odd){
        //     temp.next = node;
        //     temp = temp.next;
        // }

        // temp.next = null;

        // return newHead.next;

        ListNode evenHead = head;
        ListNode oddHead = head.next;
        ListNode even = head, odd = oddHead;

        while(odd != null && odd.next != null){
            even.next = odd.next;
            even = even.next;
            odd.next = even.next;
            odd = odd.next;
        }

        even.next = oddHead;

        return evenHead;
    }
}
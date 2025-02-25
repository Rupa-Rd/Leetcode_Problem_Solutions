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
    public boolean isPalindrome(ListNode head) {
        // Bruteforce
        StringBuilder node = new StringBuilder();
        ListNode temp = head;

        while(temp != null){
            node.append(temp.val);
            temp = temp.next;
        }

        StringBuilder reverse = new StringBuilder(node).reverse();
        System.out.println(node +" " + reverse);
        if(node.toString().equals(reverse.toString())){
            return true;
        }
        return false;
    }
}
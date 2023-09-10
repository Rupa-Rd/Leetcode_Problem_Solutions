# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        reverseList = []
        curr_node = head

        while curr_node:
            s = curr_node.val
            reverseList.append(s)
            curr_node = curr_node.next

        return reverseList == reverseList[::-1]

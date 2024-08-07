# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        result = ListNode()
        a = result
        carry = 0
        while l1 != None or l2 != None or carry!= 0:
            l1_value = l1.val if l1 else 0
            l2_value = l2.val if l2 else 0
            sum_ = l1_value + l2_value + carry
            new_node = ListNode(sum_ %10)
            carry = sum_//10
            a.next = new_node
            a = new_node
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
        return result.next 
        
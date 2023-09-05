"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        if not head :
            return None
        copiedList = {}
        curr = head
        while curr:
            copiedList[curr] = Node(curr.val)
            curr = curr.next
        curr = head
        while curr :
            copiedList[curr].next = copiedList.get(curr.next)
            copiedList[curr].random = copiedList.get(curr.random)
            curr = curr.next
        

        return copiedList[head]
#Uncomment to run it in local machine
#from typing import List

class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        people.sort()
        highest_weight = len(people) - 1
        lowest_weight = 0
        boats = 0
        while highest_weight >= lowest_weight:
            if (people[highest_weight] + people[lowest_weight]) <= limit:
                lowest_weight += 1

            boats += 1
            highest_weight -= 1
        return boats

# obj = Solution()
# print(obj.numRescueBoats([2,4,1,3,4,9],10))
class Solution:
    def groupThePeople(self, groupSizes: List[int]) -> List[List[int]]:
        groups = []
        hashmap = defaultdict(list)

        for index,size in enumerate(groupSizes):
            hashmap[size].append(index)
            if len(hashmap[size]) == size:
                groups.append(hashmap.pop(size))

        return groups
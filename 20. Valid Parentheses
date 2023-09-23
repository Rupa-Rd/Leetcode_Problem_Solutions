class Solution:
    def isValid(self, s: str) -> bool:
        brackets = ["()","[]","{}"]

        while any(i in s for i in brackets):
            for j in brackets:
                s = s.replace(j,"")
        return not s

class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = ''.join(filter(str.isalnum,s))
        s = s.lower()
        print(s)
        return s == s[::-1]
        
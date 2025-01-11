class Solution:
    def maximumValue(self, strs: List[str]) -> int:
        m=[]
        for i in strs:
            a=0
            try:
                a=int(i)
                
                m.append(a)
            except:
                a=len(i)
                m.append(a)
        print(m)
        return max(m)
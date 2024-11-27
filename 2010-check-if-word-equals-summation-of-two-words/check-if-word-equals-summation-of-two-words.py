class Solution:
    def isSumEqual(self, firstWord: str, secondWord: str, targetWord: str) -> bool:
        s=''
        s2=''
        s3=''
        for i in firstWord:
            z=ord(i)%97
            s+=str(z)
        for j in secondWord:
            y=ord(j)%97
            s2+=str(y)
        for k in targetWord:
            x=ord(k)%97
            s3+=str(x)
        n1=int(s)
        n2=int(s2)
        n3=int(s3)
        if n1+n2==n3:
            return True
        else:
            return False
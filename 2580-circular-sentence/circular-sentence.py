class Solution:
    def isCircularSentence(self, sentence: str) -> bool:
        l=sentence.split()
        c=0
        z=l[-1]
        y=l[0]
        print(z)
        print(y)
        
        if z[-1]==y[0]:
            c=1
            if (z.islower() and y.isupper()) or (z.isupper() and y.isupper()):
                c=0
            
        
            
            for i in range(len(l)-1):
                a=l[i]
                b=l[i+1]
                if a[-1]==b[0]:
                    c=1
                else:
                    c=0
                    break;
        else:
            c=0
       
        if c==1:
            return True
        else:
            return False
        
class Solution:
    def romanToInt(self, s: str) -> int:
        roman_numerals = { 'I' : 1, 'V' : 5, 'X' : 10, 'L' : 50,
        'C' : 100, 'D' : 500, 'M' : 1000}
        integer = 0
        s = s.replace('IV','IIII').replace('IX','VIIII').replace('XL','XXXX').replace('XC','LXXXX').replace('CM','DCCCC').replace('CD','CCCC')
        for roman in s :
            if roman in roman_numerals :
                integer += roman_numerals[roman]
                # print(integer)
        return integer
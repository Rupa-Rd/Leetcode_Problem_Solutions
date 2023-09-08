class Solution:
    def romanToInt(self, s: str) -> int:
        string = s.replace("IV","IIII").replace("IX","VIIII").replace("XL","XXXX").replace("XC","LXXXX").replace("CD","CCCC").replace("CM","DCCCC")
        symbols = ['I','V','X','L','C','D','M']
        roman_to_int = 0
        for i in string :
            if i in symbols:
                match i:
                    case "I":
                        roman_to_int += 1
                        
                    case "V":
                        roman_to_int += 5
                        
                    case "X":
                        roman_to_int += 10
                    
                    case "L":
                        roman_to_int += 50

                    case "C":
                        roman_to_int += 100

                    case "D":
                        roman_to_int += 500
                    case "M":
                        roman_to_int += 1000
                    
                        
                    case default:
                        break

        return roman_to_int

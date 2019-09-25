def gcdOfStrings(str1,str2):
    lenstr1,lenstr2 = len(str1),len(str2)
    
    if lenstr2 > lenstr1:
        gcdOfStrings(str2, str1)
        
    if str1[:lenstr2] == str2:
        if lenstr1 == lenstr2:
            return str2
        
        return gcdOfStrings(str2, str1[lenstr2:])
    
    return ""



print(gcdOfStrings("TAUXXTAUXX",
"TAUXXTAUXXTAUXXTAUXX"))



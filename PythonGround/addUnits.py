def addUnits(s1,s2):
    s = 0
    res = ''
    len1 = len(s1)
    len2 = len(s2)
    if len1 < len2:
        for i in range(len1):
            s = int(s1[i]) + int(s2[i])
            res = res + str(s)
        for i in range(len2-len1-1,-1):
            print(i)
            print(s2[i])
            res = res + s2[i]
    return res



s1 = '9'
s2 = '99'
print(addUnits(s1,s2))
def addDigits(s1,s2):
    l1 = len(s1)
    l2 = len(s2)
    res = ''
    if l1 == l2:
        res = addEqual(s1,s2)
    elif l1 > l2:
        #no. of 0s to be padded
        for i in range(l1-l2):
            s2 = '0' + s2
        res = addEqual(s1,s2)
    else:
        
        for i in range(l2-l1):
            s1 = '0' + s1
        res = addEqual(s1,s2)
    return res


def addEqual(s1,s2):
    res = ''
    s = 0
    for i in range(len(s1)):
        s = int(s1[i]) + int(s2[i])
        res = res  + str(s)
    return res


s1 = '7'
s2 = '12'
print(addDigits(s1, s2))
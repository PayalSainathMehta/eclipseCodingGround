def oddNumbers(l,r):
    res = []
    for i in range(l,r+1):
        if i%2 != 0:
            res.append(i)
            
    return res


res = oddNumbers(3, 9)
print('\n'.join(map(str, res)))
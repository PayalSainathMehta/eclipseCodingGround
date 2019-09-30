def removeAdjacentKDuplicates(S,k):
    res = []
    for c in S:
        count = 0
        if res and res[-1] == c:
            count = count + 1
            if count == k:
                res.pop()
            else:
                res.append(c)
        else:
            res.append(c)
    return "".join(res)
    

print(removeAdjacentKDuplicates('aabaccca',3))


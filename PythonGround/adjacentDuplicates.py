def removeAdjacentDuplicates(S):
    res = []
    for c in S:
        if res and res[-1] == c:
            res.pop()
        else:
            res.append(c)
    return "".join(res)
    

print(removeAdjacentDuplicates('aabaccca'))


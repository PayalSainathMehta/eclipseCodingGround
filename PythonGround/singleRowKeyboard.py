def calculateTime(keyword, word):
    count = 0
    curr = 0
    for ch in word:
        prev = curr
        curr = keyword.find(ch)
        count = count + abs(prev - curr)
        
    return count


print(calculateTime('abcdefghijklmnopqrstuvwxyz', 'cba'))
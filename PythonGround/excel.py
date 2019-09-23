def convertToTitle(n):
    mapping = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    result = ''
    while n:
        #n, r = divmod(n - 1, 26)
        n = (n - 1) // 26
        r = (n - 1) % 26
        
        result += mapping[r]
            
    return "".join(reversed(result))




print(convertToTitle(27))
            
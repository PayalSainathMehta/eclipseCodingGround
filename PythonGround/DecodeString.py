def decodeString(s):
    stack = []
    curNum = 0
    curString = ''        
    for c in s:
        if c.isdigit():
            curNum = curNum * 10 + int(c)
        elif c == '[':
            stack.append(curString)
            stack.append(curNum)
            curNum = 0
            curString = ''
        elif c == ']':
            num = stack.pop()
            prevString = stack.pop()
            curString = prevString + num * curString
        else:
            curString = curString + c
    return curString   
        
print(decodeString('3[a]2[bc]'))
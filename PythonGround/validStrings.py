def isValid(s):
    stack = []
    d = {')':'(','}':'{',']':'['}
    for char in s:
        if char in d:
            topElement = stack.pop() if stack else '#'
            if topElement != d[char]:
                return False    
        else:
            stack.append(char)
    
    
    return (not stack)
    
print(isValid("()"))
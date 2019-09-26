def backspaceCompare(S,T):
    def build(S):
        stack = []
        for c in S:
            if c != '#':
                stack.append(c)
            elif stack:
                stack.pop()
                
        return "".join(stack)
                
    return build(S) == build(T)

print(backspaceCompare("ab#c", "abd#"))    
    
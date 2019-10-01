def anagramMappings(A,B):
    for i in range(len(A)):
        A[i] = B.index(A[i], 0, len(B))
    
    return A

A = [84,8,0,84,0,84]
B = [84,84,8,0,0,84]
print(anagramMappings(A, B))
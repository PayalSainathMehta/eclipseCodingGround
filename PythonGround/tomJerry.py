#!/bin/python3





#
# Complete the 'play' function below.
#
# The function is expected to return an INTEGER.
# The function accepts 2D_INTEGER_ARRAY arr as parameter.
#

def play(arr):
    l = []
    for i in range(len(arr[0])):
        for j in range(len(arr)):
            l.append(arr[j][i])
            
    s = set(l)
    l = list(s)
    l = sorted(l, reverse = True)
    
    T = 0
    J = 0
    for i in range(len(l)):
        if i%2 == 0:
            T = T + l[i]
        else:
            J = J + l[i]
            
    return T-J
        

print(play([[3,7],[4,4],[7,3]]))

def printFrame(n):
    l = []
    for i in range(n):
        s = ''
        for j in range(n):
            if j == 0:
                s = s + '"'
            if i in [0,n-1] or j in [0,n-1]:
                s = s + '*'
            else:
                s = s + ' '
        if i!=n-1:
            s = s + '",'
        else:
            s = s + '"'
        l.append(s)
            #print('*' if i in [0,n-1] or j in [0,n-1] else ' ', end = '')
    return '[' + '\n'.join(l) + ']'
        
print(printFrame(4))


"""OUTPUT

["****",
"*  *",
"*  *",
"****"]

"""
def subMatrices(m,k):
    max = 0
    final = []
    for a in range(len(m)-k+1):
        for b in range(len(m[a])-k+1):
            val = 0
            l = []
            for i in range(a,k+a):
                for j in range(b,k+b):
                   #print(i,j)
                   val = val + m[i][j]
                   l.append(m[i][j])
            if val > max:
                max = val
                final = []
                final.extend(l)
            elif val == max:
                final.extend(l)   
    #print(final)
    result = set(final)
    print(sum(result))
    #print(max)           
    #print(sum)
    #1,1    
    #1,2
    #2,1    
    #2,2    
        # m = max(m,val)
        
        
        
        
if __name__=="__main__":
    m = [[1,0,1,5,6], #1033
         [3,3,0,3,3],
         [2,9,2,1,2],
         [0,2,4,2,0]]
    subMatrices(m,3)
    
    
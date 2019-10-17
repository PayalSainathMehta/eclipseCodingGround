def countPrimes(n):
    count = 0
    flag = False
    for i in range(2,n+1):
        for j in range(2,i//2+1):
            if i%j == 0:
                flag = True
                break
            else:
                break
        if flag == False:
            count = count + 1     
    return count
        
        
print(countPrimes(10))
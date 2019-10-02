import math
def isArmstrong(N):
    num = N
    no_of_dig = len(str(N))
    sum = 0
    while N:
        rem = N%10
        sum = int(sum + math.pow(rem,no_of_dig))
        N = N//10
    
    return (num==sum)


print(isArmstrong(153))
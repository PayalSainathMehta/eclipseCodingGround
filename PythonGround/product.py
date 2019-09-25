import math

def getProduct(l):
    product = 1
    for i in l:
        product = product * i

    for i in range(len(l)):
        l[i] = product // l[i]

    return l

def getProductWithoutDiv(l):
    
    sum = 0
    for i in range(len(l)):
        sum = sum + math.log10(l[i])
        #print(sum)

    for i in range(len(l)):
        l[i] = round(math.pow(10.00, sum - math.log10(l[i])))

    return l

l = [1,2,3,4,5]
print(getProductWithoutDiv(l))
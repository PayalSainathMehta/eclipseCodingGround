import math
def countPrimes(n):
   prime = [True] * n
   if n < 2:
       return 0
   else:
       prime[0] = prime[1] = False
       for i in range(2, int(math.sqrt(n)) + 1):
           if prime[i]:
               for j in range(i * i, n, i):
                   prime[j] = False
       return sum(prime)



print(countPrimes(10))
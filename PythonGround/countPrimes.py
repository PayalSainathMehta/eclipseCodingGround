import math
def countPrimes(n):
   prime = [True] * n
   print(prime)
   if n < 2:
       return 0
   else:
       prime[0] = prime[1] = False
       print(prime)
       for i in range(2, int(math.sqrt(n)) + 1):
           print("i:",i)
           if prime[i]:
               for j in range(i * i, n, i):
                   print("j:",j)
                   prime[j] = False
       return sum(prime)



print(countPrimes(10))
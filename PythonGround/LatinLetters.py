import sys

def returnInteger(s):
        char_dig = {'0':0,'1':1,'2':2,'3':3,'4':4,'5':5,'6':6,
                    '7':7,'8':8,'9':9}
        number = 0
        for ch in s:
            number = 10 * number + char_dig[ch]
        
        return number
         
for line in sys.stdin:
    numberStr = line.split(' ')
if '+' in numberStr[1]:
  op = numberStr[1].find('+')
else:
  op = numberStr[1].find('-')
#print(op)

numbers = numberStr[0]
n = returnInteger(numbers[:op])
m = returnInteger(numbers[op:])

if op.equals('+'):
  print(n + m)
else: 
  print(n - m)
  
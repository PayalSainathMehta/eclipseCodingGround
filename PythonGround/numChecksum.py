import sys

for line in sys.stdin:
    line = line.strip('\n')
 
sum = 0
num_digits = len(line)
oddeven = num_digits & 1

for count in range(0, num_digits):
  digit = int(line[count])

  if not (( count & 1 ) ^ oddeven ):
    digit = digit * 2
  if digit > 9:
    digit = digit - 9

  sum = sum + digit
print(sum)


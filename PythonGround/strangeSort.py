def strangeSort(mapping,nums):
    d = {} 
    res = []
    for i,number in enumerate(mapping):
        d[i] = number
    
    for num in nums:
        while(num>0):
            dig=num%10
            for key in d:
                if d[key] == dig:
                    res.append((key))
            num=num//10
    
    return res
    
    
    

m = int(input())
mapping = []
nums = []
for i in range(m):
    mapping.append(int(input()))

n = int(input())
for i in range(n):
    nums.append(int(input()))
    
print((strangeSort(mapping,nums)))

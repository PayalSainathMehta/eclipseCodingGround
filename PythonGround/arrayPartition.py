"""def arrayPairSum(nums):
    nums = sorted(nums)
    m = len(nums)
    if m == 2:
        return nums[0]
    lower = []
    upper = []
    for i in range(0,m//2):
        lower.append(nums[i])
    for j in range(m//2,len(nums)):
        upper.append(nums[j])
    
    return lower[0] + upper[0]

[7,3,1,0,0,6]

[0,0,1,3,6,7]

[0,0,1] = 0
[3,6,7] = 3

"""

def arrayPart(nums):
    nums = sorted(nums)
    print(nums)
    sum = 0
    for i in range(0,len(nums),2):
        sum = sum + nums[i]
        
    return sum


#print(arrayPairSum([7,3,1,0,0,6]))
print(arrayPart([7,3,1,0,0,6]))

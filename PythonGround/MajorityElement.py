import collections
def majorityElement(nums):
    count = collections.Counter(nums)
    for ele in count:
        if count[ele] > len(nums)//2:
            return ele



nums = [3,3,1,1,1,2,2,3,3,3,3]
print(majorityElement(nums))
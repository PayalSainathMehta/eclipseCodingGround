from collections import Counter
def arrayIntersect(nums1,nums2):
    return [*(Counter(nums1) & Counter(nums2)).elements()]


nums1 = [1,2,2,3]
nums2 = [2,2,4,3]
print(arrayIntersect(nums1, nums2))
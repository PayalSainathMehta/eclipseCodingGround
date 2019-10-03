def peakIndexInMountainArray(A):
    for i in xrange(len(A)):
        if A[i] > A[i+1]:
            return i
        
print(peakIndexInMountainArray([0,1,2,2,0]))
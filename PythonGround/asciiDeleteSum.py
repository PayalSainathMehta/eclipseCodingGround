import collections
def asciiDeleteSum(s1,s2):
    counts1 = collections.Counter(s1)
    counts2 = collections.Counter(s2)
    count1 = len(counts1)
    count2 = len(counts2)
    if counts1 == counts2:
        return 0
    else:
        if count1 > count2:
            for key in counts1:
                if key not in counts2:
                    del(counts1[key])
        else:
            for key in counts2:
                if key not in counts1:
                    del(counts2[key])
                    
    return (counts1,counts2)
        
print(asciiDeleteSum('sea','seat'))
    
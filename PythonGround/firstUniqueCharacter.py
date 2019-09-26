import collections
def firstUniqueCharacter(s):
    counts = collections.Counter(s)
    for i in counts:
        if counts[i] == 1:
            return s.find(i)
        
    return -1

print(firstUniqueCharacter("cc"))


import re
def indexPairs(text, words):
    list = []
    for word in words:
        l = len(word)
        for i in range(len(text)):
            if text[i:i+l] == word:
                list.append([i,i+l-1])
        
    
    return list
    
print(indexPairs('ababa', ["aba","ab"]))
def removeVowels(S):
    list = []
    for i in S:
        if i not in 'aeiou':
            list.append(i)
    return "".join(list)


print(removeVowels('aeiou'))
def addStrings(num1,num2):
    
    def returnInteger(s):
        char_dig = {'0':0,'1':1,'2':2,'3':3,'4':4,'5':5,'6':6,
                    '7':7,'8':8,'9':9}
        number = 0
        for ch in s:
            number = 10 * number + char_dig[ch]
        
        return number
    
    
    def toString(num):
        res = ''
        while num:
            num,remainder = divmod(num,10)
            res = chr(ord('0') + remainder) + res            
        return res
        
        
        
    if num1 == '0': return num2
    if num2 == '0': return num1
    m = returnInteger(num1)
    n = returnInteger(num2)
    
    return toString(m+n)

print(addStrings('0', '0'))
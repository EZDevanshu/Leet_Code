def getdigits(num):
            temp = []

            s = str(num)
            for ch in s:
                temp.append(ch)
            return temp
                
        ans = 0 
        
        for num in nums:
            digits = getdigits(num)
            for ch in digits:
                if int(ch)== digit:
                    ans+=1
        return ans
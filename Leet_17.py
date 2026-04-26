class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if not digits :
            return []
    
        di = { '2' : 'abc', '3' : 'def' , '4' : 'ghi' , '5' : 'jkl' , '6' : 'mno' , '7' : 'pqrs' , '8' : 'tuv' , '9' : 'wxyz'}

        def recurtion(index , combination):
            if len(combination) == len(digits) :
                li.append(combination)
                return 
            
            for letter in di[digits[index]] :
                recurtion(index + 1 , combination + letter)

        li = []   
        recurtion(0 , "")

        return li 
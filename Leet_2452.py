class Solution:
    def twoEditWords(self, queries: List[str], dictionary: List[str]) -> List[str]:
        li = []
        def check(s1 , s2):
            count = 0
            for i in range(len(s1)):
                if s1[i] != s2[i] :
                    count += 1
                if count == 3 :
                    return False
            return True

        for i in queries :
            for j in dictionary :
                if check(i , j) :
                    li.append(i)
                    break
        return li    

class Solution:
    def lastRemaining(self, n: int) -> int:
        
        def recur(n , p) :
            if n == 1 :
                return 1 
            if p == 1 or n % 2 == 1 :
                return 2 * recur(n // 2, 1 - p)
            return 2 * recur(n // 2 , 1 - p)  - 1
        return recur(n , 1)
        
class Solution:
    def validDigit(self, n: int, x: int) -> bool:
        str_num = str(n)
        str_digit = str(x)

        if str_num[0] == str_digit :
            return False

        for i in range(1 , len(str_num)) :
            if str_num[i] == str_digit :
                return True
        return False
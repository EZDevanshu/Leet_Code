class Solution:
    def findDegrees(self, matrix: list[list[int]]) -> list[int]:
        li = []
        for i in matrix :
            count = 0
            for j in i :


                if j == 1:
                    count += 1
            li.append(count)
        return li

class Solution:
    def maxDistance(self, colors: List[int]) -> int:
        maxVal = 0
        for i in range(len(colors)) :
            for j in range(i + 1 , len(colors)):
                if colors[i] != colors[j]:
                    maxVal = max(maxVal , abs(j - i))
        return maxVal 
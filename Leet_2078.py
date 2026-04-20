# Optimize approch
 
class Solution:
    def maxDistance(self, colors: List[int]) -> int:
        maxDist = 0

        for i in range(len(colors)):
                
            if colors[i] != colors[0] :
                maxDist = max(maxDist , i)

            if colors[i] != colors[len(colors) - 1]:
                maxDist = max(maxDist , len(colors) - 1 - i)

        return maxDist
    

#  brute force approach 


# class Solution:
#     def maxDistance(self, colors: List[int]) -> int:
#         maxVal = 0
#         for i in range(len(colors)) :
#             for j in range(i + 1 , len(colors)):
#                 if colors[i] != colors[j]:
#                     maxVal = max(maxVal , abs(j - i))
#         return maxVal     

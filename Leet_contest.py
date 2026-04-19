import sys
class Solution:
    def firstStableIndex(self, nums: list[int], k: int) -> int:
        maxNum = max(nums)
        i= 0
        while i < len(nums) :
            small , index = self.findMinimum(nums,i , len(nums))
            if abs(maxNum - small) <= k :
                return i
            i += 1
        return -1    
        
    def findMinimum(self ,nums , startIdx , endIdx) :

        minNum = sys.maxsize
        ind = -1
        for i in range(startIdx , endIdx) :
            if nums[i] < minNum :
                minNum = nums[i]
                ind = i
        return (minNum , ind)
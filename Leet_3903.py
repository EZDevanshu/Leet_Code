class Solution:
    def firstStableIndex(self, nums: list[int], k: int) -> int:
        i = 0
        
        while i < len(nums):
            maxNum = max(nums[0:i + 1:])
            minNum = min(nums[i : :])
            
            if(maxNum - minNum) <= k :
                return i
            i+= 1
        return -1
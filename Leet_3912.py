class Solution:
    def findValidElements(self, nums: list[int]) -> list[int]:
        n = len(nums)
        ans = []

        for i in range(n) :
            left = True
            for j in range(i):
                if nums[j] >= nums[i]:
                    left = False
                    break
                    
            right = True
            for j in range(i + 1 , n):
                if nums[j] >= nums[i]:
                    right = False
                    break
                    
            if left or right :
                ans.append(nums[i])

        return ans
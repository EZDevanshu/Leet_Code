class Solution:
    def compareBitonicSums(self, nums: list[int]) -> int:
        sumInc = 0
        sumDcr = 0
        n = len(nums)
        
        for i in range(n) :

            if i < n - 1 and nums[i] < nums[i + 1] :
                sumInc += nums[i]
            elif i > 0 and nums[i] < nums[i - 1] :
                sumDcr += nums[i]

        if sumInc > sumDcr :
            return 0
        elif sumInc < sumDcr :
            return 1 
        else :
            return -1
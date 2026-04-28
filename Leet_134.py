class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:

        if sum(gas) < sum(cost) :
            return -1 

        idx = 0 
        haveGas = 0

        for i in range(len(gas)) :
            haveGas += gas[i] - cost[i]

            if haveGas < 0 :
                idx = i + 1
                haveGas = 0
            
        return idx

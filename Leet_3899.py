class Solution:
    def internalAngles(self, sides: list[int]) -> list[float]:
        
        if not (sides[0] + sides[1] > sides[2] and sides[1] + sides[2] > sides[0] and sides[0] + sides[2] > sides[1]) :
            return []
        
        cosA = (sides[1] ** 2 + sides[2] ** 2 - sides[0] ** 2) / (2 * sides[1] * sides[2])

        cosB = (sides[0] ** 2 + sides[2] ** 2 - sides[1] ** 2) / (2 * sides[0] * sides[2])

        cosC = (sides[0] ** 2 + sides[1] ** 2 - sides[2] ** 2) / (2 * sides[0] * sides[1])

        cosA = max(-1 , min(1 , cosA))
        cosB = max(-1 , min(1 , cosB))
        cosC = max(-1 , min(1 , cosC))
        
        

        A = math.degrees(math.acos(cosA))
        B = math.degrees(math.acos(cosB))
        C = math.degrees(math.acos(cosC))
        
        return sorted([A, B , C])
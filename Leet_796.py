class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        if len(s) != len(goal) :
            return False

        # this is concate two string "s" then check if string "goal" in "(s + s)""
        # ex : s = "abcde" , goal = cdeab 
        # (s + s) => abcde + abcde => abcdeabcde" 
        # if goal in (s + s) then its true else false
        return goal in (s + s)
        
        
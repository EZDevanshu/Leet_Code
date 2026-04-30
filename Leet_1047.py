class Solution:
    def removeDuplicates(self, s: str) -> str:
        li = []

        for i in s :
            if li and li[-1] == i :
                li.pop()
            else :
                li.append(i)
        return "".join(li)
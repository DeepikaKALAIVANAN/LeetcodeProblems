class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        i, j = 0, 0
        res = []
        flag = True
        while i < len(word1) and j < len(word2):
            if flag == True:
                res.append(word1[i])
                i += 1
                flag = False
            else:
                res.append(word2[j])
                j += 1
                flag = True
        while i < len(word1):
            res.append(word1[i])
            i += 1
        while j < len(word2):
            res.append(word2[j])
            j += 1

        return ''.join(res)
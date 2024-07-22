class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) > len(t):return False
        if len(s) == 0:return True
        subseq = 0
        for i in range(0,len(t)):
            if subseq <= len(s) -1:
                print(s[subseq])
                if s[subseq]==t[i]:
                    subseq+=1
        return subseq == len(s)
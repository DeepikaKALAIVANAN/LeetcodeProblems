class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        words = s.split()
        if len(pattern) != len(words):
            return False
        p_to_w = {}
        w_to_p = {}
        for p, w in zip(pattern, words):
            if p not in p_to_w and w not in w_to_p:
                p_to_w[p] = w
                w_to_p[w] = p
            elif p_to_w.get(p) != w or w_to_p.get(w) != p:
                return False
        return True
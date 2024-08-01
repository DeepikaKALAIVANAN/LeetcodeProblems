class Solution(object):
    def fullJustify(self, words, maxWidth):
        """
        :type words: List[str]
        :type maxWidth: int
        :rtype: List[str]
        """
        res, cur, numOfLetters = [], [], 0
        for w in words:
            if numOfLetters + len(w) + len(cur) > maxWidth:
                for i in range(maxWidth - numOfLetters):
                    cur[i%(len(cur)-1 or 1)] += ' '
                res.append(''.join(cur))
                cur, numOfLetters = [], 0
            cur += [w]
            numOfLetters += len(w)
        res.append(' '.join(cur).ljust(maxWidth))
        return res
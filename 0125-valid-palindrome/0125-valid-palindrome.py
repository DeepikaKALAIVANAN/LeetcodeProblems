class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        trimmed_str = ''.join(c.lower() for c in s if c.isalnum())
        return trimmed_str == trimmed_str[::-1]
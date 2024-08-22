class Solution(object):
    def findComplement(self, num):
        """
        :type num: int
        :rtype: int
        """
        binary = bin(num)[2:]
        compliment = ''.join('1' if bit == '0' else '0' for bit in binary)
        integer = int(compliment, 2)
        return integer
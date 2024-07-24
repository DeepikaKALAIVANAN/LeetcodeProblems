class Solution(object):
    def summaryRanges(self, nums):
        """
        :type nums: List[int]
        :rtype: List[str]
        """
        result = []
        n = len(nums)
        if n == 0:
            return result
        start = 0
        end = 0
        while end < n:
            while end + 1 < n and nums[end + 1] == nums[end] + 1:
                end += 1
            if start == end:
                result.append(str(nums[start]))
            else:
                result.append(str(nums[start]) + "->" + str(nums[end]))
            start = end + 1
            end += 1
        return result
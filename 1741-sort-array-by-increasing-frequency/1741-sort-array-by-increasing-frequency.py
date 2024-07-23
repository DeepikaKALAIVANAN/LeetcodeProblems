class Solution(object):
    def frequencySort(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        freq_map = Counter(nums)
        sort_nums = sorted(nums, key = lambda x: (freq_map[x], -x))
        return sort_nums
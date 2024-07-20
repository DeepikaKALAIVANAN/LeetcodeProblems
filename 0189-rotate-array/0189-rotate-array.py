class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        k=k%len(nums)
        r=len(nums)-k
        new=nums[0:r]
        nums[0:r]=[]
        nums.extend(new)
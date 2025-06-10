class Solution:
    def jump(self, nums: List[int]) -> int:
        ans = 0
        last =0
        maximum=0
        for i , x in enumerate(nums[:-1]):
            maximum = max(maximum, i+nums[i])
            if last==i:
                ans+=1
                last=maximum
        return ans
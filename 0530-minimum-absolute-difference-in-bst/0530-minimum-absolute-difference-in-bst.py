# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def getMinimumDifference(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        def inorder(node):
            return inorder(node.left) + [node.val] + inorder(node.right) if node else []
        nums = inorder(root)
        return min(b - a for a, b in zip(nums,nums[1:]))
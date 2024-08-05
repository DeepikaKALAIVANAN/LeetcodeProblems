# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def averageOfLevels(self, root):
        """
        :type root: TreeNode
        :rtype: List[float]
        """
        levels = []
        ret = []

        def helper(node, level):
            if not node:
                return 
            if len(levels) ==  level:
                levels.append([])
            helper(node.left, level + 1)
            levels[level].append(node.val)
            helper(node.right, level + 1)
        
        helper(root, 0)

        for level in levels:
            _sum = sum(level)
            ret.append(float(float(_sum) / len(level)))
        return ret
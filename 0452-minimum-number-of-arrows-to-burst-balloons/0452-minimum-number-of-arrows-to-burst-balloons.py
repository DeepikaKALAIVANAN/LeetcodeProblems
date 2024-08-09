class Solution(object):
    def findMinArrowShots(self, points):
        """
        :type points: List[List[int]]
        :rtype: int
        """
        if not points:
            return 0
        points.sort(key = lambda x: x[1])
        arrows = 1
        curr_arrow = points[0][1]
        for balloon in points:
            if balloon[0] > curr_arrow:
                arrows += 1
                curr_arrow = balloon[1]
        return arrows
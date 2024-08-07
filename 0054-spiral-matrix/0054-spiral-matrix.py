class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if not matrix:
            return []

        m, n = len(matrix), len(matrix[0])
        result = []
        seen = [[False] * n for _ in range(m)]

        dr = [0, 1, 0, -1]
        dc = [1, 0, -1, 0]

        r, c, di = 0, 0, 0

        for _ in range(m * n):
            result.append(matrix[r][c])
            seen[r][c] = True

            newR, newC = r + dr[di], c + dc[di]

            if 0 <= newR < m and 0 <= newC < n and not seen[newR][newC]:
                r, c = newR, newC
            else:
                di = (di + 1) % 4
                r += dr[di]
                c += dc[di]
        return result
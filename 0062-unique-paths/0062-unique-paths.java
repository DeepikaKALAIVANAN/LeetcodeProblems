class Solution {
    public int uniquePaths(int m, int n) {
        /*int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        return DFS_memo(0, 0, m, n, dp);
    }

    public int DFS_memo(int sr, int sc, int m, int n, int[][] dp) {
        if (sr >= m || sc >= n) return 0;
        if (sr == m - 1 && sc == n - 1) return 1;
        if (dp[sr][sc] != -1) return dp[sr][sc];

        int la = DFS_memo(sr + 1, sc, m, n, dp);
        int ra = DFS_memo(sr, sc + 1, m, n, dp);
        
        dp[sr][sc] = la + ra;
        return dp[sr][sc];*/

        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1; 
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}


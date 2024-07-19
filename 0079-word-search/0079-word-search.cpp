class Solution {
private:
    // Depth First Search function
    bool dfs(int i, int j, int k, vector<vector<char>>& board, string word) {
        int n = board.size();
        int m = board[0].size();

        // If the length of the word matches k, we found a match
        if (word.size() == k)
            return true;

        // Check if current indices (i, j) are out of bounds or if the character doesn't match
        if (i < 0 || i >= n || j < 0 || j >= m || board[i][j] != word[k])
            return false;
        
        char temp = board[i][j];
        board[i][j] = '*'; // Mark current cell as visited

        // Recursively explore adjacent cells
        bool ans = (dfs(i + 1, j, k + 1, board, word) ||
                    dfs(i - 1, j, k + 1, board, word) ||
                    dfs(i, j + 1, k + 1, board, word) ||
                    dfs(i, j - 1, k + 1, board, word));
        
        board[i][j] = temp; // Restore the original value of the current cell

        return ans; // Return the result of exploration
    }

public:
    // Main function to search for the word on the board
    bool exist(vector<vector<char>>& board, string word) {
        int n = board.size();
        int m = board[0].size();
        
        // Iterate over each cell on the board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If the first character matches and DFS returns true, return true
                if (board[i][j] == word[0] && dfs(i, j, 0, board, word))
                    return true;
            }
        }
        return false; // If no match is found, return false
    }
};
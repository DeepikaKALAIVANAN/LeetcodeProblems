class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        bool rows[9][9] = {false};
        bool cols[9][9] = {false};
        bool boxes[9][9] = {false};

        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                if (board[y][x] == '.') {
                    continue;
                }

                int num = board[y][x] - '0' - 1;
                int box = y/3 * 3 + x/3;

                if (rows[y][num] || cols[x][num] || boxes[box][num]) {
                    return false;
                }

                rows[y][num] = true;
                cols[x][num] = true;
                boxes[box][num] = true;
            }
        }

        return true;
    }
};
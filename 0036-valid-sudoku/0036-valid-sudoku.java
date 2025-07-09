class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            Set<Character> set = new HashSet<>();
            for(int j = 0; j < 9; j++){
                char item = board[i][j];
                if(item != '.' && !set.add(item)){
                    return false;
                }
            }
        }
        for(int i = 0; i < 9; i++){
            Set<Character> set = new HashSet<>();
            for(int j = 0; j < 9; j++){
                char item = board[j][i];
                if(item != '.' && !set.add(item)){
                    return false;
                }
            }
        }
        int[][] valids = {{0,0},{0,3},{0,6},
        {3,0},{3,3},{3,6},
        {6,0},{6,3},{6,6}};
        for(int[] valid : valids){
            Set<Character> set = new HashSet<>();
            for(int i = valid[0]; i < valid[0] + 3; i++){
                for(int j = valid[1]; j < valid[1] + 3; j++){
                    char item = board[i][j];
                    if(item != '.' && !set.add(item)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
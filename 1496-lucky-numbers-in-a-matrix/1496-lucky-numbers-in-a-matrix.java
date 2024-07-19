
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < matrix.length; i++) {
            int minVal = Integer.MAX_VALUE;
            int minCol = -1;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    minCol = j;
                }
            }
            
            boolean isMaxInCol = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minCol] > minVal) {
                    isMaxInCol = false;
                    break;
                }
            }
            
            if (isMaxInCol) {
                result.add(minVal);
            }
        }
        
        return result;
    }
}
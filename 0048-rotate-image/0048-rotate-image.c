void rotate(int** matrix, int matrixSize, int* matrixColSize) {
    // Swap rows
    for(int i = 0; i < matrixSize / 2; i++) {
        int* temp = matrix[i];
        matrix[i] = matrix[matrixSize - i - 1];
        matrix[matrixSize - i - 1] = temp;
    }

    // Transpose the matrix
    for(int i = 0; i < matrixSize; i++) {
        for(int j = i + 1; j < matrixSize; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
}

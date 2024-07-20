bool searchMatrix(int** matrix, int matrixSize, int* matrixColSize, int target){
if(target<matrix[0][0]){
    return false;
}
if(target>matrix[matrixSize-1][matrixColSize[matrixSize-1]-1]){
    return false;
}
for(int i=0;i<matrixSize;i++){
    if(target<=matrix[i][matrixColSize[i]-1]){
        for(int j=0;j<matrixColSize[i];j++){
            if(target==matrix[i][j]){
                return true;
            }
        }
    }
}
return false;
}
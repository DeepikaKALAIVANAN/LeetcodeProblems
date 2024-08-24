class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            int tempSum = 0;
            for(int j = i; j < n; j++){
                tempSum += arr[j];
                if ((j - i + 1) % 2 != 0){
                    sum += tempSum;
                }
            }
        }
        return sum;
    }
}
class Solution {
    public void mergeArray(int[] arr, int low, int high, int mid) {
        int i = low;
        int j = mid + 1;
        int k = 0;
        int res[] = new int[high - low + 1];
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                res[k] = arr[i];
                i++;
                k++;
            } else {
                res[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            res[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high) {
            res[k] = arr[j];
            j++;
            k++;
        }
        for (i = low; i <= high; i++) {
            arr[i] = res[i - low];
        }
    }

    public void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            mergeArray(arr, low, high, mid);
        }
    }

    public int[] sortArray(int[] res) {
        if (res == null || res.length == 0) {
            return res;
        }
        mergeSort(res, 0, res.length - 1);
        return res;
    }
}

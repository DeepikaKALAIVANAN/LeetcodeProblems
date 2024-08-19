class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int sum = 0;
        int n = nums.size(); // nums.size() get size of array
        for(int i = 0; i < n;i++){
            sum = sum ^ nums[i]; // using xor to compare the elements and nums[i] to access the ith element
        }
        return sum;
    }
};

// comparison always 2 for loops
// selecting a number outer for loop     // it is brute force time complexity more so use bit manipulation
// comparing the values inner for loop 

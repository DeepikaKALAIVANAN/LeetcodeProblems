// since only 3 values are there we compare the 3 values and swap it
class Solution {
public:
    void sortColors(vector<int>& nums) {
        int left = 0, right = nums.size() - 1, mid = 0;
        while (mid <= right) {
            if (nums[mid] == 0) { // if mid is 0 the value is swapped to left
                swap(nums[left], nums[mid]);
                left++;
                mid++;
            } else if (nums[mid] == 1) { // since the middle value should be 1 if mid is 1 then value is moved to right
                mid++;
            } else { // if mid is 2 then the value with right is swapped because 2 should be in right
                swap(nums[mid], nums[right]);
                right--;
            }
        }
    }
};
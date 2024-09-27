class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int ans = 0;
        HashSet<Character> set = new HashSet<>();
        while(right < s.length()){
            char ch = s.charAt(right);
            // check if char present in set, if present remove it(shrinking)
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            // if not in set then add or shrink and add
            set.add(ch);
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}
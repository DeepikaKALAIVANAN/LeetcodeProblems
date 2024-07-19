class Solution {
public:
    int longestPalindrome(string s) {
        vector<int> S(58, 0); // A~Z, a~z
        for(int i = 0; i < s.size(); i++) {
            S[s[i] - 'A'] += 1;
        }
        bool first = 0;
        int ans = 0;
        for(int i = 0; i < S.size(); i++) {
            if(!first && S[i] % 2 == 1) {
                first = 1;   
            }
            else if(first && S[i] % 2 == 1) {
                S[i] -= 1;
            }
            ans += S[i];
        }
        return ans;
    }
};
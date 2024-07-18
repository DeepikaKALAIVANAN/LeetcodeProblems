class Solution {
public:
    string convert(string s, int n) {
        if(n==1) return s;
        int x = 2*n-2;

        int i=0;
        string ans="";
        while(i<n){
            int j=i;
            while(j<s.size()){
                ans+=s[j];
                if(i>0 && i<n-1 && j+x-2*i<s.size()){
                    ans+=s[j+x-2*i];
                }
                j+=x;
            }
            i++;
        }
        return ans;
    }
};
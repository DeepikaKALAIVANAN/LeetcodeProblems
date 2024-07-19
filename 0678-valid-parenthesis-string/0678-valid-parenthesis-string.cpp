
#include <bits/stdc++.h>
using namespace std;

void __print(int x) { cerr << x; }
void __print(long x) { cerr << x; }
void __print(long long x) { cerr << x; }
void __print(unsigned x) { cerr << x; }
void __print(unsigned long x) { cerr << x; }
void __print(unsigned long long x) { cerr << x; }
void __print(float x) { cerr << x; }
void __print(double x) { cerr << x; }
void __print(long double x) { cerr << x; }
void __print(char x) { cerr << '\'' << x << '\''; }
void __print(const char* x) { cerr << '\"' << x << '\"'; }
void __print(const string& x) { cerr << '\"' << x << '\"'; }
void __print(bool x) { cerr << (x ? "true" : "false"); }

template <typename T, typename V> void __print(const pair<T, V>& x) {
    cerr << '{';
    __print(x.first);
    cerr << ',';
    __print(x.second);
    cerr << '}';
}
template <typename T> void __print(const T& x) {
    int f = 0;
    cerr << '{';
    for (auto& i : x)
        cerr << (f++ ? "," : ""), __print(i);
    cerr << "}";
}
void _print() { cerr << "]\n"; }
template <typename T, typename... V> void _print(T t, V... v) {
    __print(t);
    if (sizeof...(v))
        cerr << ", ";
    _print(v...);
}
#ifndef ONLINE_JUDGE
#define debug(x...)                                                            \
    cerr << "[" << #x << "] = [";                                              \
    _print(x)
#else
#define debug(x...)
#endif

static auto fastio = []() {
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(nullptr);
    std::cout.tie(nullptr);
};

class Solution {
public:
    bool checkValidString(string s) {
        fastio();
        set<int> star_ind;
        for (int i = 0; i < int(s.size()); i++) {
            if (s[i] == '*')
                star_ind.insert(i);
        }
        stack<pair<char, int>> st;
        for (int i = 0; i < int(s.size()); i++) {
            if (s[i] == '*')
                continue;
            if (!st.empty()) {
                if (st.top().first == '(') {
                    if (s[i] == ')')
                        st.pop();
                    else
                        st.push({s[i], i});
                } else {
                    st.push({s[i], i});
                }
            } else {
                st.push({s[i], i});
            }
        }

        while (!st.empty() && (int(star_ind.size())) > 0) {
            int idx = st.top().second;
            char ch = st.top().first;
            if (ch == '(') {
                auto lb = star_ind.lower_bound(idx);
                if (lb == star_ind.end())
                    break;
                else {
                    st.pop();
                    star_ind.erase(lb);
                }
            } else {
                auto lb = star_ind.lower_bound(idx);
                if (lb == star_ind.begin()) {
                    break;
                }
                else{
                    st.pop();
                    lb--;
                    star_ind.erase(lb);
                }
            }
        }
        if (st.empty())
            return true;
        return false;
    }
};
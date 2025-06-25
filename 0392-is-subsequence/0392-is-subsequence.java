class Solution {
    public boolean isSubsequence(String s, String t) {
        int st = 0;
        int tt = 0;
        while(st < s.length() && tt < t.length()){
            if(s.charAt(st) == t.charAt(tt)){
                st++;
            }
            tt++;
        }
        return st == s.length();
    }
}
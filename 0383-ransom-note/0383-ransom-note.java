class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hash = new HashMap<>();
        for(char ch: magazine.toCharArray()){
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        }
        for(char ch : ransomNote.toCharArray()){
            if(hash.getOrDefault(ch, 0) > 0){
                hash.put(ch, hash.get(ch) - 1);
            }else{
                return false;
            }
        }
        return true;
    }
}
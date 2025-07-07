class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> hash = new HashMap<>();
        String word = "balloon";
        for(char ch : text.toCharArray()){
            if(word.indexOf(ch) != -1){
                hash.put(ch, hash.getOrDefault(ch, 0) + 1);
            }
    }
        if( !hash.containsKey('b') || 
        !hash.containsKey('a') || 
        !hash.containsKey('l') ||
        !hash.containsKey('o') || 
        !hash.containsKey('n')){
            return 0;
        }else{
            return Math.min(Math.min(hash.get('b'), hash.get('a')), Math.min(hash.get('l')/2, Math.min(hash.get('o') / 2, hash.get('n'))));
        }
    }
}
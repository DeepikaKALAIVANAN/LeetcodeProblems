class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        boolean flag = true;
        while(i<word1.length() && j<word2.length()){  // check if i and j are less than their word sizes
            if(flag){   // flag = true
            sb.append(word1.charAt(i));  //print word1 value where pointer is pointing
            i++;  // increment the pointer of word1
        }else{   // if flag is false 
            sb.append(word2.charAt(j)); // print the word2 value where pointer is pointing
            j++;  // increment the pointer of word2
        }
        flag = !flag;  // toggle the boolean value of flag to false
    }
    while(i<word1.length()){
        sb.append(word1.charAt(i));  // print all the remaining letters fron word1 after word2 ends 
        i++;  // increment i
    }
    while(j<word2.length()){
        sb.append(word2.charAt(j)); // print the remaining letters from word2 after word1 ends
        j++; // increment j 
    }
    return sb.toString(); // convert stringbuilder to string and return the answer
    }
}
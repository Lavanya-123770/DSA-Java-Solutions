class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder Sb = new StringBuilder();
        int left = 0; 
        int right = 0;
        while(left < word1.length() && right < word2.length()){
            Sb.append(word1.charAt(left));
            Sb.append(word2.charAt(right));
            left++;
            right++;
        }
        Sb.append(word1.substring(left));
        Sb.append(word2.substring(right));
        return Sb.toString();
    }
}
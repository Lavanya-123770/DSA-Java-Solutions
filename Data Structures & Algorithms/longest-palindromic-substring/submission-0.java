class Solution {
    public String longestPalindrome(String s) {
        if(s.length() < 1 || s == null) return "";

        int start = 0; 
        int end = 0;
        for(int i = 0; i < s.length() ; i++){
            int len1 = solve(s , i , i);
            int len2 = solve(s , i , i + 1);

            int len = Math.max(len1 , len2);
            if(len > end - start){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
            
        }
        return s.substring(start , end + 1);
    }
    public int solve(String s  , int left , int right){
        while(right < s.length() && left >= 0 && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}

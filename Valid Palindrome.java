A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 
class Solution {
    public boolean isPalindrome(String s) {
        int j = 0;
         s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = s.length() - 1; i >= j; i--) {  
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                j++;
            }
        }
        return true;
    }
}
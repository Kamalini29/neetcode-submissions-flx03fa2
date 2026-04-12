class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder strb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                strb.append(Character.toLowerCase(c));
            }
        }
        return strb.toString().equals(strb.reverse().toString());

    }
}

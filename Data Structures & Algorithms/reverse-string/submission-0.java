class Solution {
    public void reverseString(char[] s) {
        int j = s.length-1;
        for(int i =0; i<(s.length/2); i++){
            swap(s,i,j);
            j--;
        }
    }
    public char[] swap(char[] s, int i, int j){
        char tem = s[i];
        s[i] = s[j];
        s[j] = tem;
        return s;
    }
}
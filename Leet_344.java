class Solution {
    public void reverseString(char[] s) {
        int i = 0 ;
        int j = s.length() - 1;

        while(i < j){
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
            i++;
            j--;
        }
    }
}

class Leet_344{
    public static void main(String[] args) {
        char s[] = {"h","e","l","l","o"};

        Solution obj = new Solution();

        obj.reverseString(s);
    }
}
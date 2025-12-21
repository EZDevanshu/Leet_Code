import java.util.*;

class Solution { public int lengthOfLastWord(String s) {

        s = s.trim(); int count = 0;

        for(int i = s.length() - 1 ; i >= 0 ; i--){ if(s.charAt(i) == ' ')
        { break; } else{ count++; } } return count; } }

class Leet_58{
    public static void main(String[] args) {
        String str = "Hello World ";

        Solution obj = new Solution();
        int ans = obj.lengthOfLastWord(str);

        System.out.println(ans);
    }
}
import java.util.*;

class Solution {
    public String reverseWords(String s) {
        
        Stack<String> st = new Stack<>();

        s = s.trim();
        String[100] word = s.split("\\s+");

        for(int i = 0 ; i < word.length; i++){
            st.push(word[i]);
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}

class Leet_151{
    public static void main(String[] args) {
        
        String str = "the sky is blue";

        Solution obj = new Solution();
        String ans = obj.reverseWords(str);

        System.out.println(ans);
    }
}
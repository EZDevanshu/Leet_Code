import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character , Integer> freq = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        Stack<Character> visited = new Stack<>();

        for(char c : s.toCharArray()){
            freq.put(c , freq.getOrDefault(c, 0) + 1);
        }        

        for(char c : s.toCharArray()){

            freq.put(c , freq.get(c) - 1);

            if(visited.contains(c)){
                continue;
            }
            while(!stack.isEmpty() && stack.peek() > c && freq.get(stack.peek()) > 0){
                visited.remove(stack.pop());
            }

            stack.push(c);
            visited.add(c);
        }

        StringBuilder sb = new StringBuilder();

        for(char c : stack){
            sb.append(c);
        }

        return sb.toString();
    }
} 

class Leet_316{
    public static void main(String[] args) {
        String s = "cbacdcbc";

        Solution obj = new Solution();
        String ans = obj.removeDuplicateLetters(s);

        System.out.println(ans);
    }
}
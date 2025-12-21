import java.util.*;
class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> charStack = new Stack<>();
        Stack<Integer> intStack = new Stack<>();
 
        StringBuilder current = new StringBuilder();
        int num = 0;

        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                num = num * 10 + (ch - '0');
            }

            else if(ch == '['){
                intStack.push(num);
                charStack.push(current);

                current = new StringBuilder();
                num = 0;
            }

            else if(ch == ']'){
                int times = intStack.pop();
                StringBuilder str = charStack.pop();

                while(times != 0){
                    str.append(current);
                    times--;
                }

                current = str;
            }

            else{
                current.append(ch);
            }
            i++;
        }
        return current.toString();
    }
}
class Leet_394{
    public static void main(String[] args) {
        String s = "3[a]2[bc]";

        Solution obj = new Solution();

        String ans = obj.decodeString(s);

        System.out.println(ans.toString());
    }
}
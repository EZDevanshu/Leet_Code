import java.util.*;

class Solution {
    public String convertToTitle(int columnNumber) {
        
        StringBuilder sb = new StringBuilder();

        while(columnNumber > 0){
            columnNumber--;
            char ch = (char)(columnNumber % 26 + 'A');

            sb.append(ch);
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }
}
class Leet_168{
    public static void main(String[] args) {
        int num = 1000;

        Solution obj = new Solution();

        String ans = obj.convertToTitle(num);

        System.out.println(ans);
    }
}
import java.util.*;

    class Solution {
        public int titleToNumber(String columnTitle) {
            int ans = 0;
            int c = 0;
            for(int i = 0 ; i < columnTitle.length() ; i++){
                char ch = columnTitle.charAt(i);

                int val = ch - 'A'  + 1;

                ans = ans * 26 + val;
            }

            return ans;
        }
    }


class Leet_171{
    public static void main(String[] args) {
        String str = "CMZ";

        Solution obj = new Solution();

        System.out.println(obj.titleToNumber(str));
    }
}
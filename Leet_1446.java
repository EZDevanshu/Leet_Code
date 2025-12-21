import java.util.*;

class Solution {
    public int maxPower(String s) {
        
        int res = 1;
        int count = 1;

        for(int i = 1 ; i < s.length() ; i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                count += 1;
            }
            else{
                res = Math.max(res , count);
                count = 1;
            }
        }
        return res;
    }
}

class Leet_1446{
    public static void main(String[] args) {
        
        String s = "abbcccddddeeeeedcba";
        Solution obj = new Solution();

        int ans = obj.maxPower(s);
        System.out.println(ans);
    }
}
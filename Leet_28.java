import java.util.*;
class Solution {
    public int strStr(String haystack, String needle) {
    
        int n = haystack.length();
        int m = needle.length();

        for(int i = 0 ; i < n ; i++){

            if((i+m <= n) && haystack.substring(i , i + m).equals(needle)){
               return i;
            }
        }
        return -1;
    }
}

class Leet_28{
    public static void main(String[] args) {
       String haystack = "a";
       String needle = "a";

       Solution obj = new Solution();
       int ans = obj.strStr(haystack , needle);

       System.out.println(ans);
    }
}
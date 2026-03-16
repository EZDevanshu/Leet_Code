import java.util.*;
class Leet_389 {

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        Solution obj = new Solution();
        char ans = obj.findTheDifference(s, t);

    }
}

class Solution {

    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> mp = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            mp.put(s.charAt(i) , mp.getOrDefault(s.charAt(i) , 0) + 1);
        }

        for(int j = 0 ; j < t.length() ; j++){
            char ch = t.charAt(j);

            if(!mp.containsKey(ch) ||  mp.get(ch) == 0){
                return ch;
            }
            mp.put(ch , mp.get(ch) -  1);
        }
        return ' ';
    }
}

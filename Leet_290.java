
import java.util.HashMap;

class Solution {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (words.length != pattern.length()) {
            return false;
        }

        HashMap<Character, Integer> mp1 = new HashMap<>();
        HashMap<String, Integer> mp2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String str = words[i];

            if (!mp1.containsKey(ch)) {
                mp1.put(ch, i);
            }
            if (!mp2.containsKey(str)) {
                mp2.put(str, i);
            }
            if (!mp1.get(ch).equals(mp2.get(str))) {
                return false;
            }
        }
        return true;
    }
}

public class Leet_290 {

    public static void main(String[] args) {
        String s = "abba";
        String t = "dog cat cat chut";

        Solution obj = new Solution();
        boolean ans = obj.wordPattern(s, t);

        System.out.println(ans);
    }
}

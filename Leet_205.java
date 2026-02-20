import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character , Integer> mp1 = new HashMap<>();
        HashMap<Character , Integer> mp2 = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            if(!mp1.containsKey(s.charAt(i))){
                mp1.put(s.charAt(i) , i);
            }
            if(!mp2.containsKey(t.charAt(i))){
                mp2.put(t.charAt(i) , i);
            }
            if(!mp1.get(s.charAt(i)).equals(mp2.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
public class Leet_205 {
    public static void main(String[] args) {
        String s = "f11";
        String t = "b23";

        Solution obj = new Solution();
        boolean ans = obj.isIsomorphic(s , t);

        System.out.println(ans);
    }
}

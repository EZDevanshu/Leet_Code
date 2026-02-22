
class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr1 = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            arr1[ch - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (arr1[ch - 'a'] == 0) {
                return false;
            }
            arr1[ch - 'a']--;
        }
        return true;
    }
}

public class Leet_383 {

    public static void main(String[] args) {
        String s = "aa";
        String b = "aab";

        Solution obj = new Solution();
        boolean ans = obj.canConstruct(s, b);
    }
}


class Solution {

    public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0;
        int maxLen = 0;

        // Map<Character , Integer> map = new HashMap<>();
        // for(end = 0 ; end < s.length() ; end++){
        //     char ch = s.charAt(end);
        //     if(map.containsKey(ch)){
        //         start = Math.max(start , map.get(ch) + 1);
        //     }
        //     map.put(ch, end);
        //     maxLen = Math.max(maxLen , end - start + 1);
        // }
        boolean arr[] = new boolean[256];

        while (start < s.length()) {
            if (!arr[s.charAt(start)]) {
                arr[s.charAt(start)] = true;
                maxLen = Math.max(maxLen, start - end + 1);
                start++;
            } else {
                arr[s.charAt(end)] = false;
                end++;
            }
        }

        return maxLen;
    }
}

class Leet_3 {

    public static void main(String[] args) {
        String str = "abcabcbb";

        Solution obj = new Solution();

        System.out.println(obj.lengthOfLongestSubstring(str));
    }
}

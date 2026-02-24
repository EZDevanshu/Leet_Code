import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch , i);
        }

        int max = 0;
        int pre = -1;

        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            max = Math.max(max , map.get(ch));
            if(max == i){
                ans.add(max - pre);
                pre = max;
            }
        }
        return ans;
    }
}

public class Leet_763 {
    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";

        Solution obj = new Solution();
        System.out.println((obj.partitionLabels(s)));
    }
}

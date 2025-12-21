import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character , Integer> map = new HashMap<>();

        for(int j = 0 ; j < s.length() ; j++){
            char ch = s.charAt(j);
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }

        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            if(map.get(ch) == 1){
                return i;
            }
            i++;
        }

        return -1;
    }
}
class Leet_387{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the String : ");
        String s = sc.nextLine();

        // System.out.println(s);

        Solution obj = new Solution();

        int ans = obj.firstUniqChar(s);

        System.out.println(ans);
    }
}
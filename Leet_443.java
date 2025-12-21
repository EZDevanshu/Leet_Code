import java.util.*;

class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();

        int count = 1;

        for(int i = 1 ; i <= chars.length ; i++){

            if(i == chars.length || chars[i] != chars[i - 1]){
                sb.append(chars[i - 1]);

                if(count > 1){
                    sb.append(count);
                }
                count = 1;
            }
            else{
                count++;
            }
        }
        char[] compressed = sb.toString().toCharArray();
        for(int i = 0 ; i < compressed.length ; i++){
            chars[i] = compressed[i];
        }
        return compressed.length;
    }
}

class Leet_443 {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};

        Solution obj = new Solution();
        int ans = obj.compress(chars);

        System.out.println(ans);
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            count[ch - 'a']++;
        }
        for(int j = 0 ; j < t.length() ; j++){
            char ch = t.charAt(j);
            count[ch - 'a']--;
        }

        for(int k = 0 ; k < count.length ; k++){
            if(count[k] > 0){
                return false;
            }
        }
        return true;
    }
}

class Leet_242{
    public static void main(String[] args) {
        
    }
}
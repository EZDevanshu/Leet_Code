class Solution {
    public String reverseWords(String s) {
        int i = 0;
        int count = 0;
        StringBuilder first = new StringBuilder();
        while(i < s.length() && s.charAt(i) != ' '){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                count++;
            }
            first.append(ch);
            i++;
        }
        i++;
        while(i < s.length()){
            int count2 = 0;
            StringBuilder str = new StringBuilder();

            while(i < s.length() && s.charAt(i) != ' '){
                char ch = s.charAt(i);
                if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                    count2++;
                }
                str.append(s.charAt(i));
                i++;
            }
            first.append(' ');
            if(count2 == count){
                first.append(str.reverse());
            }
            else{
                first.append(str);
            }
            i++;
        }
        return first.toString();
    }
}

class LCQ2_480{
    public static void main(String[] args) {
        String s = "ten";

        Solution obj = new Solution();

        String ans = obj.reverseWords(s);

        System.out.println(ans.toString());
    }
}
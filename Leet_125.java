    // class Solution {
    //     public boolean isPalindrome(String s) {
    //         int i = 0;
    //         int j = s.length() - 1;
    //         s = s.toLowerCase();

    //         while(i <= j){
    //             if(!character.isLetterOrDigit(s.charAt(i))){
    //                 i++;
    //                 continue;
    //             }
    //             if(!character.isLetterOrDigit(s.charAt(j))){
    //                 j--;
    //                 continue;
    //             }

    //             if(s.charAt(i) == s.charAt(j)){
    //                 i++;
    //                 j--;
    //             }
    //             else{
    //                 return false;
    //             }
    //         }

    //         return true;
    //     }
    // }

    // class Leet_125{
    //     public static void main(String[] args) {
    //         String s = "A man, a plan, a canal: Panama";

    //         Solution obj = new Solution();
    //         boolean ans = obj.isPalindrome(s);

    //         System.out.println(ans);
    //     }
    // }
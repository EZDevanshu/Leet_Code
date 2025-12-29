// class Solution {
//     public String multiply(String num1, String num2) {
//         int n = num1.length();
//         int m = num2.length();

//         int pos[] = new int[n + m];

//         if(num1.charAt(0) == '0' || num2.charAt(0) == '0'){
//             return "0";
//         }

//         for(int i = n - 1 ; i >= 0 ; i--){
//             for(int j = m - 1 ; j >= 0 ; j--){
//                 int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0')

//                 product += pos[i + j + 1];

//                 pos[i + j + 1] += product % 10;
//                 pos[i + j] += product / 10;
//             }
//         }

//         StringBuilder sb = new StringBuilder();

//         for(int x : pos){
//             if(x == 0 || sb.length() == 0){
//                 continue;
//             }

//             sb.append(x);
//         }

//         return sb.toString();
//     }
// }

// class Leet_43{
//     public static void main(String[] args) {
//         String num1 = "123";
//         String num2 = "456";

//         Solution obj = new Solution();

//         String ans = obj.multiply(num1 , num2);


//         System.out.println(ans);
//     }
// }
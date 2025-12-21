import java.util.*;

class Solution {
    public boolean judgeSquareSum(int c) {
       int a = 0;
       int b = (int)Math.sqrt(c);

        while(a <= b){
            long sum = (long)a*a + b*b;

            if(sum == c){
                return true;
            }
            else if(sum < c) {
                a++;
            }
            else{
                b--;
            }
       }
       return false;
    }
}

// class Solution {
//     public boolean judgeSquareSum(int c) {

//         for (int a = 0; a * a <= c; a++) {
//             int b2 = c - a * a;          // b² = c - a²
//             int b = (int)Math.sqrt(b2);  // take sqrt

//             if (b * b == b2) {           // check if perfect square
//                 return true;             // a² + b² = c
//             }
//         }

//         return false;
//     }
// }

// this give me TLE....


class Leet_633{
    public static void main(String[] args) {
        int n = 2147483600;

        Solution obj = new Solution();

        System.out.println(obj.judgeSquareSum(n));
    }
}

// c = 2147483600
// ans should be true 
// pair = 45800^2 + 7060^2


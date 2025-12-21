class Solution {
    public int mySqrt(int n) {
        int s = 0;
        int e = n;
        int ans = 0;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if ((long)m * m <= n) { // use long to avoid overflow
                ans = m;       // store possible answer
                s = m + 1;     // try for bigger root
            } else {
                e = m - 1;
            }
        }
        return ans;
    }
}

class Leet_69{
    public static void main(String[] args) {
        
    }
}
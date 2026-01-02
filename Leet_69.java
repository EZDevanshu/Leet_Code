class Solution {
    public int mySqrt(int n) {
        int s = 0;
        int e = n;
        int ans = 0;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if ((long)m * m <= n) { 
                ans = m;      
                s = m + 1;     
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
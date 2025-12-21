class Solution {
    public int uniquePaths(int m, int n) {
        int n = m + n - 2;

        // smallest out of those 2 
        int r = Math.min(n - 1 , m - 1);

        int ans = 1;
        for(int i = 1 ; i <= r ; i++){
            ans = ans * (N - r + i) / i;
        }   

        return ans;
    }   
}

class Leet_62{
    public static void main(String[] args) {
        int m = 3 , n = 7;

        Solution obj = new Solution();

        int ans = obj.uniquePaths(m , n);

        System.out.println(ans);
    }
}
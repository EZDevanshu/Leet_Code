public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int s = 1;
        int e = n;

        while(s <= e){
            int m = s + (e - s) / 2;

            int ans = guess(m);

            if(ans == 0){
                return m;
            }
            else if(ans > 0){
                s = m + 1;
            }
            else{
                e = m - 1;
            }
        }
        return -1;
    }
}
public class Leet_374 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int ans = obj.guessNumber(10);

        System.out.println(ans);
    }
}

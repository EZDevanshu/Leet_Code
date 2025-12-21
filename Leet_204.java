class Solution {
    public int countPrimes(int n) {

        int count = 0 ;
        if(n <= 1){
            return 0;
        }
        for(int i = 2 ; i < n ; i++){
            if(checkPrime(i)){
                count++;
            }
        }

        return count;
    }
    public boolean checkPrime(int n){

        for(int i = 2 ; i < Math.sqrt(n) ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}

class Leet_204{
    public static void main(String[] args) {
        int n = 10;

        Solution obj = new Solution();

        int ans = obj.countPrimes(n);

        System.out.println(ans);
    }
}
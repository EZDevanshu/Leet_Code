class Solution {
    public boolean isPowerOfThree(int num) {
            
        if(num == 1){
            return true;
        }
        if(num <= 0 || num % 3 != 0){
            return false;
        }
        return isPowerOfThree(num / 3);
    }
}

class Leet_326{
    public static void main(String[] args) {
        int n = 45;

        Solution obj = new Solution();

        System.out.println(obj.isPowerOfThree(n));
    }
}
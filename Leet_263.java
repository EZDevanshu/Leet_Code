class Solution {
    public boolean isUgly(int n) {
        if(n <= 0){
            return false;
        }

        // int nums [] {2 , 3, 5};

         
        // for(num : nums){
        //     while(n % num == 0){
        //         n /= num;
        //     }
        // }
        if(n == 1){
            return true;
        }
        else{
            return false;
        }
    }
}

class Leet_263{
    public static void main(String[] args) {
        int n = 6;

        Solution obj = new Solution();

        boolean ans = obj.isUgly(n);

        System.out.println(ans);
    }
}
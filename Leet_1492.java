class Solution {
    public int kthFactor(int n, int k) {
        // int l = 0;
        // int arr[] = new int[n];
        int count = 0;
        // for(int i = 1 ; i <= n ; i++){

        //     if(n % i == 0){ 
        //         arr[l] = i;
        //         l++;
        //         count++;
        //     }
        // }
        // if(k > count){
        //     return - 1;
        // }
        // else{
        //     return arr[k - 1];
        // }

        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                count++;
            }

            if(count == k){
                return i;
            }
        }

        return -1;
    }
}

class Leet_1492{
    public static void main(String[] args) {
        int n = 4;
        int k = 4;

        Solution obj = new Solution();
        int ans = obj.kthFactor(n , k);

        System.out.println(ans);
    }
}
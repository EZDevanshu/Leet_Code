class Solution {
    public int bulbSwitch(int n) {
        
        // boolean[] arr = new boolean[n];

        // for(int i = 0 ; i < n ; i++){
        //     for(int j = 0 ; j < n ; j++){
        //         if((j+1) % (i+1) == 0){
        //             if(arr[j]){
        //                 arr[j] = false;
        //             }
        //             else{
        //                 arr[j] = true;
        //             }
        //         }
        //     }
        // }

        // int count = 0;
        // for(int i = 0 ; i < n ; i++){
        //     if(arr[i]){
        //         count++;
        //     }
        // }
        return (int)Math.sqrt(n);
    }
}

class Leet_319{
    public static void main(String[] args) {
        int n = 10;

        Solution obj = new Solution();
        int ans = obj.bulbSwitch(n);

        System.out.println(ans);
    }
}
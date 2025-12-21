class Solution {
    public int maxAscendingSum(int[] arr) {
    
    int max = arr[0];
    int res = arr[0];

    for(int i = 1 ; i < arr.length ; i++){

        if(arr[i] > arr[i-1]){
            max += arr[i];
        }
        else{
            max = arr[i];
        } 
        res = Math.max(res , max);
    }
     return res ;   
    }
}   

class Leet_1800{
    public static void main(String[] args) {
        int[] arr = {5,5,6,6,6,9,1,2} ;

        Solution obj = new Solution();
        int ans = obj.maxAscendingSum(arr);

        System.out.println(ans);
    }
}
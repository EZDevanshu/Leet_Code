class Solution {
    public int minimumOperations(int[] arr) {
        
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] % 3 != 0){
                count++;
            }
        }
        return count;
    }
}

class Leet_3190{
    public static void main(String[] args) {
        int arr[] = {3,6,9};

        Solution obj = new Solution();

        int ans = obj.minimumOperations(arr);

        System.out.println(ans);
    }
}
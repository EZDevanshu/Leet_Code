class Solution {
    public int findFinalValue(int[] arr, int original) {

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == original){
                return findFinalValue(arr , 2 * original);
            }
        }
        return original;
    }
}

class Leet_2154{
    public static void main(String[] args) {
        int arr[] = {5,3,6,1,12};
        int original = 3;


        Solution obj = new Solution();
        int ans = obj.findFinalValue(arr , original);

        System.out.println(ans);
    }
}
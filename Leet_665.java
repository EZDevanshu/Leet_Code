class Solution {
    public boolean checkPossibility(int[] arr) {
        int count = 0;

        for(int i = 1; i < arr.length ; i++){
            if(arr[i] < arr[i- 1]){
                count++;

                if(count > 1){
                return false;
                }
                if(i == 1 || arr[i] >= arr[i - 2]){
                    arr[i - 1] = arr[i];
                }
                else{
                    arr[i] = arr[i - 1];
                }
            }
        }

        return true;
    }
}

class Leet_665{
    public static void main(String[] args) {
        int arr[] = {3,4,2,3};

        Solution obj = new Solution();

        boolean ans = obj.checkPossibility(arr);

        System.out.println(ans);
    }
}
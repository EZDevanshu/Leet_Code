class Solution {
    public int[] finalPrices(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[j] <= arr[i]){
                    arr[i] = arr[i] - arr[j];
                    break;
                }
            }
        }

        return arr;
    }
}

class Leet_1475{
    public static void main(String[] args) {
        int arr[] = {8,4,6,2,3};

        Solution obj = new Solution();

        int arrAns[] = obj.finalPrices(arr);

        for(int i = 0 ; i < arrAns.length ; i++){
            System.out.println(arrAns[i]);
        }
    }
}
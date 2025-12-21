class Solution {
    public void moveZeroes(int[] arr) {
        int i = 0 ;

        for(int j = 0 ; j < arr.length ; j++){
            if(arr[j] == 0){
                continue;
            }
            if(arr[j] > 0){
                arr[i] = arr[j];
                i++;
            }
        }

        while(i < arr.length){
            arr[i] = 0;
            i++;
        }  
    }
}

class Leet_283{
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};

        Solution obj = new Solution();
        obj.moveZeroes(arr);

    }
}
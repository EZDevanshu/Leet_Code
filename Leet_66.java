import java.util.*;
class Solution {
    public int[] plusOne(int[] arr) {

        for(int i = arr.length - 1; i >= 0 ; i--){
            if(arr[i] < 9){
                arr[i]++ ;
                return arr;
            }
            else{
                arr[i] = 0;
            }
        }

        int newArray [] = new int[arr.length + 1];
        newArray[0] = 1;

        return newArray;
    }
}

class Leet_66{
    public static void main(String[] args) {
        int arr[] = {4,3,2,1};

        Solution obj = new Solution();

        int ans[] = obj.plusOne(arr);

        System.out.println(Arrays.toString(arr));
    }
}
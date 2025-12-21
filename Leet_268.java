import java.util.Arrays;
class Solution {
    public int missingNumber(int[] arr) {
        
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr , i , arr[i]);
            }else{
                i++;
            }
        }
        for(int j = 0 ; j < arr.length ; j++){
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

public class Leet_268{
    public static void main(String[] args) {
       
    int [] arr = {0, 5, 4, 3, 2};
    Solution obj = new Solution();
    int missing = obj.missingNumber(arr);
    System.out.println(missing); 
    }
}
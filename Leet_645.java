import java.util.Arrays;
class Solution {
    public int[] findErrorNums(int[] arr) {
            
        int i = 0 ;

        while(i < arr.length){
            int correct = arr[i] - 1;

            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[j] != j + 1){
                     return new int[] {arr[j] , j + 1};
                }
            }

            return new int[]{-1 , -1};
         
    }
        public static void swap(int[] arr , int first , int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
}

public class Leet_645{
    public static void main(String[] args) {
        int[] arr = {2,2};

        Solution obj = new Solution();

        System.out.println(Arrays.toString(obj.findErrorNums(arr)));
    }
}
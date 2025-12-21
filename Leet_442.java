import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static List<Integer> findDuplicates(int[] arr) {
    
    int i = 0 ;

        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[j] != j+1){
                ans.add(arr[j]);
            }
        }
        return ans;
    }

    public static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

public class Leet_442{
    public static void main(String[] args) {
        
        int[] arr = {4,3,2,7,8,2,3,1};

        Solution obj = new Solution();

        System.out.println(obj.findDuplicates(arr));
    }
}

import java.util.Arrays;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length < 2){
            return false;
        }
        int diff = arr[1] - arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            if(!(diff == arr[i] - arr[i - 1])){
                return false;
            }
        }
        return true;
    }
}
public class Leet_1502 {
    public static void main(String[] args) {
        int arr[] = {};

        Solution obj = new Solution();

        boolean ans = obj.canMakeArithmeticProgression(arr);

        System.out.println(ans);
    }
}

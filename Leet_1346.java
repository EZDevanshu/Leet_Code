import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean checkIfExist(int[] arr) {

        Set<Integer> obj = new HashSet<>();

        for(int i = 0 ; i < arr.length ; i++){
            if(obj.contains(2 * arr[i])|| (arr[i] % 2 == 0 && obj.contains(arr[i] / 2))) {
                return true;
            }
            obj.add(arr[i]);
        }
        return false;
    }
}

class Leet_1346{
    public static void main(String[] args) {
        int[] arr = {7,1,14,11};

        Solution obj = new Solution();
        System.out.println(obj.checkIfExist(arr));
    }
}
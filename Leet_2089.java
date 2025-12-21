import java.util.*;
class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {

        Arrays.sort(arr);

        List<Integer> list = new ArrayList<>();
        int i = 0 ;
        while(i < arr.length){
            if(arr[i] == target){
                list.add(i);
            }
            if(arr[i] > target){
                break;
            }
            i++;
        }

        return list;
    }
}

class Leet_2089{
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,3};
        int target = 3;

        Solution obj = new Solution();
        List<Integer> ans = obj.targetIndices(arr, target);

        System.out.println(ans);

    }
}
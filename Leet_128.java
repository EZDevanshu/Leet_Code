import java.util.*;

class Solution {
    public int longestConsecutive(int[] arr) {

    if(arr.length == 0){
        return 0;
    }

    Arrays.sort(arr);

   int count = 1;
   int res = 1;

       for(int i = 0 ; i < arr.length - 1 ; i++){

            if(arr[i] == arr[i+1]){
                continue;
            }

            if(arr[i] + 1 == arr[i + 1]){
                count++;
            }
            else {
                count = 1;
            }
            res = Math.max(res , count);
       }

       return res;

    }
}

class Leet_128{
    public static void main(String[] args) {
        int[] arr = {1,0,1,2};

        Solution obj = new Solution();
        int ans = obj.longestConsecutive(arr);

        System.out.print(ans);
    }
}
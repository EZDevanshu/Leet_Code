import java.util.*;
class Solution {
    public int singleNonDuplicate(int[] arr) {
        
        int s = 0;
        int e = arr.length - 1;

        while(s < e){
            int mid = s + (e - s) / 2;

            if(mid % 2 == 1){
                mid--;
            }

            if(arr[mid] == arr[mid + 1]){
                s = mid + 2;
            }

            else{
                e = mid;
            }
        }

        return arr[s];
    }
}

class Leet_540{
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};

        Solution obj = new Solution();
        int ans = obj.singleNonDuplicate(arr);

        System.out.println(ans);
    }
}
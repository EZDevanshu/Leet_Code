import java.util.*;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] orignalArr) {
         
        List<Boolean> ans = new ArrayList<>();

        // int num = 0;
        // for (int val : ans) {
        //     num = (num * 2 + val)
        //     ans.add(n == 0);
        // }
        return ans;
    }
}

class Leet_1018 {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1};

        Solution obj = new Solution();
        List<Boolean> ans = obj.prefixesDivBy5(arr);

        System.out.println(ans);  // Output should be [true, false, false]
    }
}


// class Leet_1018{
//     public static void main(String[] args) {
//         int arr[] = {0,1,1};

//         Solution obj = new Solution();
//         List<Boolean> ans = obj.prefixesDivBy5(arr);

//         System.out.println(ans);
//     }
// }
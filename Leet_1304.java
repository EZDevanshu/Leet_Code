import java.util.Arrays;
class Solution {
    public int[] sumZero(int n) {

        int[] arr = new int[n];
        int idx = 0 ;

        for(int i = 1 ; i <= n/2 ; i++){
            arr[idx++] = -i;
            arr[idx++] = i; 
        }
        if(n % 2 != 0){
            arr[idx++] = 0;
        }

        return arr;
    }
}
class Leet_1304{
    public static void main(String[] args) {
        int target = 1;
        Solution obj = new Solution();
        System.out.println(Arrays.toString(obj.sumZero(target)));
    }
}


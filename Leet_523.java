import java.util.*;

class Solution {
    public boolean checkSubarraySum(int[] arr, int k) {
        int sum = 0;
        int c = 0;

        if(arr.length > 1 && k == 0){
            return true;
        }
        for(int i = 0 ; i < arr.length ; i++){
            sum = arr[i];
            c = 1;
            if(i == arr.length - 1){
                if(sum % k == 0 && c > 1){
                    return true;
                }
            }
            for(int j = i + 1 ; j < arr.length ; j++){
                if(sum % k == 0 && c > 1){
                    return true;
                }
                sum += arr[j];
                c++;
            }
        }
        return false;
    }
}

class Leet_523{
    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);
        
        // System.out.println("Enter the size of array");
        // int size = sc.nextInt();

        // int arr[] = new int[size];

        // System.out.println("Enter vakue of K :");
        // int k = sc.nextInt();

        Solution obj = new Solution();

        int arr [] = {0, 0};
        int k = 0;

        boolean ans = obj.checkSubarraySum(arr , k);

        System.out.println(ans);        
    }
}
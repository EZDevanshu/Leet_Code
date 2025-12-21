import java.util.*;

class Solution {
    public int absDifference(int[] arr, int k) {
        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;
        int num1 = 0;
        int num2 = 0;

        while(k != 0){
        	num1 += arr[i];
        	i++;
        	num2 += arr[j];
        	j--;
        	k--;
        }

        int ans = Math.abs(num1 - num2);

        return ans;
    }
}

class LCQ1_480{
	public static void main(String[] args) {
		int arr[] = {100};
		int k = 1;

		Solution obj = new Solution();

		System.out.println(obj.absDifference(arr, k));
	}
}

import java.util.*;

class Solution {

    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int newArr[] = new int[arr1.length + arr2.length];

        int i = 0;
        int p1 = 0;
        int p2 = 0;

        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] <= arr2[p2]) {
                newArr[i++] = arr1[p1++];
            } else {
                newArr[i++] = arr2[p2++];
            }
        }

        while (p1 < arr1.length) {
            newArr[i++] = arr1[p1++];
        }
        while (p2 < arr2.length) {
            newArr[i++] = arr2[p2++];
        }

        int n = newArr.length;

        if (n == 0) {
            return 0.0;
        }
        if (n % 2 == 1) {
            return newArr[n / 2];
        } else {
            return (newArr[n / 2 - 1] + newArr[n / 2]) / 2.0;
        }
    }
}

public class Leet_4 {

    public static void main(String[] args) {
        int arr1[] = {1, 2};
        int arr2[] = {3};

        Solution obj = new Solution();
        double ans = obj.findMedianSortedArrays(arr1, arr2);

        System.out.println(ans);
    }
}

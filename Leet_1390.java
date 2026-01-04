
class Solution {

    public int sumFourDivisors(int[] arr) {
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int sum = 0;
            for (int j = 1; j * j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    sum += j;
                    count++;
                    int x = arr[i] / j;

                    if (j != x) {
                        count++;
                        sum += x;
                    }
                }
                if (count > 4) {
                    break;
                }
            }
            if (count == 4) {
                totalSum += sum;
            }
        }
        return totalSum;
    }
}

class Leet_1390 {

    public static void main(String[] args) {
        int arr[] = {21, 4, 7};
        Solution obj = new Solution();

        int ans = obj.sumFourDivisors(arr);

        System.out.println(ans);
    }
}

import java.util.Arrays;
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int top = 0;
        int right = n - 1;
        int bottom = n - 1;
        int left = 0;
        int count = 1;

        while(top <= bottom && left <= right){
            for(int i = left ; i<= right ; i++){
                arr[top][i] = count++;
            }
            top++;
            for(int i = top ; i<= bottom ; i++){
                arr[i][right] = count++;
            }
            right--;
            for(int i = right ; i>= left ; i--){
                arr[bottom][i] = count++;
            }
            bottom--;
           for (int i = bottom; i >= top; i--) {
                arr[i][left] = count++;
            }
            left++;

        }
        return arr;
    }
}

class Leet_59{
    public static void main(String[] args) {
        int n = 3;

        Solution obj = new Solution();
        int[][] result = obj.generateMatrix(n);
            for (int i = 0; i < result.length; i++) {
                System.out.print("[");
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j]);
                    if (j != result[i].length - 1) {
                    System.out.print(", ");
                 }
            }
                System.out.println("]");
}

    }
}
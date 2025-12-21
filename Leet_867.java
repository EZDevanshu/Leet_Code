import java.util.Arrays;
class Solution {
    public int[][] transpose(int[][] arr) {

        int[][] transposed = new int[arr[0].length][arr.length];
        
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                transposed[j][i] =arr[i][j];
            }
        }
        return transposed;
    }
}

class Leet_867{
    public static void main(String[] args) {
        
        int[][] arr = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                    };

        Solution obj = new Solution();
        int[][] res = obj.transpose(arr);

        for (int[] row : res) {
            System.out.println(Arrays.toString(row));
        }
    }
}
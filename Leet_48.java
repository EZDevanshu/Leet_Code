import java.util.*;

class Solution {
    public void rotate(int[][] matrix) {
		int top = 0; 
		int bottom = matrix.length - 1;

		while(top < bottom){
			for(int col = 0 ; col < matrix.length ; col++){
				int temp = matrix[top][col];
				matrix[top][col] = matrix[bottom][col];
				matrix[bottom][col] = temp;
			}
			bottom--;
			top++;
		}

		for(int row = 0 ; row < matrix.length ; row++){
			for(int col = row + 1 ; col < matrix.length ; c++){
				int temp = matrix[row][col];
				matrix[row][col] = matrix[col][row];
				matrix[col][row] = temp;
			}
		}
    }
}

class Leet_48{
	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

		Solution obj = new Solution();

		obj.rotate(arr);
	}
}
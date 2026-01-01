import java.util.Scanner;

class Solution {
public
    boolean isPowerOfTwo(int n) {

        if(n>=0 && (n & (n - 1)) == 0){
			return true;
		} 
		else{
			return false;
		}
    }
}
public class Leet_231{
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int num = sc.nextInt();

		Solution obj = new Solution();
		 boolean ans = obj.isPowerOfTwo(num);
		  System.out.println(ans);
		
	}
}
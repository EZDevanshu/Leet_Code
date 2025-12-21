import java.util.Scanner;

class Solution {
public boolean isPalindrome(int x) {
        int rem = 0 ;
		long rev = 0 ;
		long temp = x ;

		while(x != 0 && x>0){
			rem = x % 10 ;
			rev = (rev*10) + rem;
			x /=10;
		}
		 return rev == temp;
    }
}
	class Leet_9{
		public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number you want to cheak : ");
	int num = sc.nextInt();

	 Solution obj = new Solution();
		boolean ans = obj.isPalindrome(num);

		System.out.println(ans);
	}
}
	



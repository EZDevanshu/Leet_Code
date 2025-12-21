import java.util.Scanner;

class Solution {
    public int fib(int n) {
        int a = 0 ,b = 1 ;

 		for(int i = 0 ; i<n ; i++){
 			int temp = a + b ;
 			a = b ;
 			b = temp ;
 		}
 		return a;
    }
}

public class Leet_509{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int num = sc.nextInt();

        Solution obj = new Solution();
       int ans =  obj.fib(num);

       System.out.println(ans);
    }
}
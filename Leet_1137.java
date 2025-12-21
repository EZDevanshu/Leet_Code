import java.util.Scanner;


class Solution {
    public int tribonacci(int n) {
        if(n == 0){
        	return 0 ;
        }
        if(n == 1 || n == 2){
        	return 1;
        }
        int a = 0 ,b =1 , c = 1 ;
        int temp = 0 ;

         for(int i = 3 ; i<=n ;i++){
         	temp = a+b+c;
         	a = b;
         	b = c ;
         	c = temp ;
         }
         return temp ;
    }
}
public class Leet_1137{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number you want to tribonacci number : ");
		int num = in.nextInt();

		Solution obj = new Solution();
		 int ans = obj.tribonacci(num);

		 System.out.println(ans);
	}
}
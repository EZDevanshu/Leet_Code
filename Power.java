import java.util.Scanner;
class Solution {
    public double myPow(double x, long n) {
        double sum=1;
        // if (n == Integer.MIN_VALUE) {
        //     // To avoid overflow, use Integer.MAX_VALUE and adjust for the negative exponent
        //     return myPow(x, Integer.MAX_VALUE) * (1 / x);
        // }
        if (n == Long.MIN_VALUE) {
            return myPow(x, Long.MAX_VALUE) * (1 / x);
        }

        if (n < 0) {
            x = 1 / x;
            n *= -1;

        }
            for(double i = 0 ; i < n ; i++)
            {
                sum = x*sum ;
            }

        return sum;
    }
}
class Power
{
    public static void main(String []args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base : ");
        double base = sc.nextDouble();

        System.out.println("Enter expo : ");
        long expo = sc.nextLong();

        Solution obj = new Solution();
         obj.myPow(base , expo);


    }
}
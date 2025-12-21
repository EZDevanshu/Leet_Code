import java.util.Scanner;
    
class Solution {
    public int divide(int dividend, int divisor) {


        if (dividend == Integer.MIN_VALUE && divisor == -1){
          return Integer.MAX_VALUE ;
        }
        if(dividend < 0 && divisor <0){
          return (Math.abs(dividend) / Math.abs(divisor));
        }
      

        return dividend / divisor ;
        
    }
}
    class Divide{
      public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Divident : ");
        int divident = sc.nextInt();

        System.out.println("Enter the Diviser : ");
        int diviser = sc.nextInt();

        Solution obj = new Solution();
      int ans =  obj.divide(divident, diviser);
      System.out.println(ans);
    }
}
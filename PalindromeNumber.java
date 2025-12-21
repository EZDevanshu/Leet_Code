import java.util.Scanner;
class Solution{
    public boolean isPalindrome(int num){
        if (num < 0) {
            return false;   
        }
        int originalNum = num;   
        int rev = 0;
        
        while (num != 0) {
            int rem = num % 10;  
            rev = rem + rev * 10;  
            num /= 10;   
        }
        
         return rev == originalNum;
        
    }
}

public class PalindromeNumber{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 

       System.out.println("Enter Number you want to  check : ");
       int num = sc.nextInt();
      
       Solution obj = new Solution();
     boolean b1 =  obj.isPalindrome(num);
     if (b1){
         System.out.println("pelindrome");
     }
     else{
        System.out.println(" not pelindrome");

     }
       
       sc.close();
    }
}
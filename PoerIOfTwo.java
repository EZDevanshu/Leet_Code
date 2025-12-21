import java.util.Scanner;

class Solution {
    public boolean isPowerOfTwo(int n) 
    {
        while(true)
        {
            if(n==0)
            {
                return false;
            }
            if(n%2==0 || n==1 )
            {
                n = n/2;
                if(n==1 || n==0)
                {
                    return true;
                }
            }
            else
            {
                return false;

            }
        }
        
    }
}

public class PoerIOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the power : ");
        int power = sc.nextInt();

        Solution obj = new Solution();
        boolean ans = obj.isPowerOfTwo(power);
        System.out.println(ans);

    }
}

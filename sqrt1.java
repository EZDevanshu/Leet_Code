import java.util.Scanner;
class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int low=1;
        int high=x;
        int result=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid<=x/mid){
                result=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return result;
    }
}

public class sqrt1 {
     public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Solution obj = new Solution();
         int ans = obj.mySqrt(num);
        System.out.println(ans);
    }
}

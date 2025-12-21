import java.util.Scanner;
class Solution {
    public int searchInsert(int[] arry, int target) {

        for (int i = 0; i < arry.length- 1; i++) {

            int tempINdex = i;
            int tempMin = arry[i];
            for (int j = i + 1; j < arry.length; j++) {
                if (tempMin > arry[j]) {
                    tempMin = arry[j];
                    tempINdex = j;
                }
            }
            if (tempINdex != i) {
                arry[tempINdex] = arry[i];
                arry[i] = tempMin;
            }
        }
        int   ans =0 ;
        for (int i = 0; i < arry.length; i++) {
            if (target == arry[i]) {
                ans = i;
                System.out.println(ans);
                break;
            }
            else if (target < arry[0] ){
                ans =i ; 
                System.out.println(ans);
                break;
            }
            else if (target > arry[arry.length-1]){
                ans =  arry.length;
                System.out.println(ans);
                break;
            }
            else if (target > arry[i] && target < arry[i+2]){
                ans =i+1 ; 
                System.out.println(ans);
                break;
            }
            else if (target < arry[i] && target != 0 ) {
                ans = i - 1;
                System.out.println(ans);
 
                 break;
             }
            
        }
        return ans ;
    }
}
         public class Search {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter the size of arry");
                int size = sc.nextInt();

                int[] arry = new int[size];

                System.out.println("Enter element of arry");
                for (int i = 0; i < size; i++) {
                    arry[i] = sc.nextInt();
                }
                System.out.println("Enter Target Element");
                int target = sc.nextInt();

                Solution obj = new Solution();
                obj.searchInsert( arry , target);
                sc.close();
            }
        }

    


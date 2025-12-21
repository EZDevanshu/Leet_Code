import java.util.Scanner;
public class TwoDSumArry
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element of Num1 : ");
        int ele1 = sc.nextInt();

        int [][]arri = new int[ele1][2];

        for (int i = 0; i < ele1; i++) 
        {
            System.out.println("Enter the elememts : "+(i+1));
           
            for (int j = 0; j < 2; j++) 
            {
                arri[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Element of Num1 : ");
        int ele2 = sc.nextInt();

        int [][]arrj = new int[ele2][2];

        for (int i = 0; i < ele2; i++) 
        {
            System.out.println("Enter the elememts : "+(i+1));
           
            for (int j = 0; j < 2; j++) 
            {
                arrj[i][j] = sc.nextInt();
            }
        }
            int [][]arrk = new int[ele1][2];
            while(arri[ele1][2] == arrj[ele2][2])
            {
                 
            }
        sc.close();
    }
}

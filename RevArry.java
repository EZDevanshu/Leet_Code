import java.util.Scanner;

class RevArry {
    public static void main(String args[]) {
        int rev = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();

        while (x != 0) {
            int rem = x % 10;  // Get the last digit
            rev = rem + rev * 10;  // Append the last digit to rev
            x /= 10;  // Remove the last digit from x
        }

        // After the loop, rev will contain the reversed number
        System.out.println("Reversed number: " + rev);
    }
}

import java.util.Scanner;

public class HappyNumber {

    // Helper method to calculate the next number in the sequence
    public static int getNext(int num) {
        int sum = 0;
        while (num > 0) {
            int x = num % 10;
            sum += x * x;
            num /= 10;
        }
        return sum;
    }

    // Method to determine if the number is a happy number
    public static boolean isHappyNumber(int num) {
        int slow = num;
        int fast = getNext(num);

        while (fast != 1 && fast != slow) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
    }

    // Main method to read input and print result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if (isHappyNumber(num)) {
            System.out.println(num + " is a Happy Number");
        } else {
            System.out.println(num + " is NOT a Happy Number");
        }

        sc.close();
    }
}
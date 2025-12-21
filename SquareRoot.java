import java.util.Scanner;

class SquareRootCalculator {
    // Function to calculate square root using simple iterative approach
    public int sqrtIterative(int n) {
        if (n < 0) return -1; // Return -1 for negative numbers (invalid case)
        if (n == 0 || n == 1)
          return n; // Square root of 0 and 1 is itself
        
        int i = 0, result = 0;
        
        // Incrementing step by step
        while (i * i <= n) {
            result = i;
            i++;
        }
        
        return result;
    }
}

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        SquareRootCalculator calculator = new SquareRootCalculator();
        int result = calculator.sqrtIterative(num);
        
        if (result == -1)
            System.out.println("Invalid input: Square root of negative number is not real.");
        else
            System.out.printf("Square root of %d is %d\n", num, result);
        
        scanner.close();
    }
}

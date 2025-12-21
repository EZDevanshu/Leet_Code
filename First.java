import java.util.*;

public class First {
    public static void main(String[] args) {
        int nums[] = {1}; 
        
        int temp = 1;

        if (nums[0] == 0 || nums[0] == 1 || nums[1] == 1) {
            for (int i = 1; i < nums.length; i++) {
                if (temp == nums[i]) {
                    temp++;
                    System.out.println("temp : " + temp);
                } else {
                    System.out.print(temp);
                }
            }
        }
         else
          {
            System.out.print(temp);
        }

    }
}

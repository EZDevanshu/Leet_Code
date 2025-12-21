import java.util.Scanner;

	class Solution {
	    public int numWaterBottles(int numBottles, int numExchange) {
	 	
	 		int totalDrink = numBottles ;
	 		int emptyBottles = numBottles ;

	 		while(emptyBottles >= numExchange){
	 			int newBottles = emptyBottles / numExchange ;
	 			totalDrink += newBottles ;
	 			emptyBottles = emptyBottles % numExchange + newBottles ;
	 		}       
	 		return totalDrink ;
	    }
	}

public class Leet_1518{
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);

	System.out.println("Enter the botle you have right now :");
	int numBottles = in.nextInt();

	System.out.println("Enter the number of exchange bottle :");
	int numExchange = in.nextInt();

		Solution obj = new Solution();
		int ans = obj.numWaterBottles(numBottles , numExchange);

		System.out.println("Total drink bottles is : "+ans);
	}
}
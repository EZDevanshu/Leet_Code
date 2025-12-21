class Solution {
    public int findNumbers(int[] nums) {
 		
 		int count = 0 ;

 		for(int num : nums){
 			int digit = 0 ;
 			while(num > 0 ){
 				num /= 10 ;
 				digit++;
 			}
 			if(digit % 2 == 0){
 				count++;
 			}
 		}
 		return count;
    }
}

public class Leet_1295
{
	public static void main(String[] args) 
	{
	
		int [] arr = {12,345,2,6,7896};
		
		Solution obj = new Solution();
		 int ans = obj.findNumbers(arr);	

		 System.out.println(ans);	 
	}
}
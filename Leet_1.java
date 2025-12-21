import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0 ; i < nums.length ; i++){
        	int sum = 0;
        	for(int j = i+1 ; j < nums.length ; j++){
        		if(target == nums[i] + nums[j]){
        			return new int []{i,j};
        		}
        	}
        }
        return new int[]{-1 , -1};
    }
}

public class Leet_1{
	public static void main(String[] args) {

	int [] arr = {3,2,4};
	int target = 6 ;

	Solution obj = new Solution();
	int ans[] = obj.twoSum( arr , target);	

	System.out.println(Arrays.toString(ans));
	}
}
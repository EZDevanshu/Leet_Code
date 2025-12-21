class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int ans = Integer.MIN_VALUE;

        for(int [] accountArr : accounts){
        	int sum = 0 ;
        	for(int account : accountArr){
        		sum += account;
        	}
        	if(sum > ans){
        		ans = sum ;
        	}
        }
        	return ans;
    }
}

public class Leet_1672{
	public static void main(String[] args) {
		int arr[][] = {{1,5},
						{7,3},
						{3,5}
 					};
		Solution obj = new Solution();
		int r = obj.maximumWealth(arr);

		System.out.println(r);
	}
}
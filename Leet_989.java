import java.util.*;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();

        for(int i = num.length - 1 ; i >= 0 ; i--){
        	k = num[i] + k ;
        	num[i] = k % 10;
        	k = k / 10;
        }

        while(k > 0){
        	res.add(0, k % 10);
        	k /= 10;
        }

        for (int val : num){
        	res.add(val);
        }

       	return res;
    }
}

public class Leet_989{
	public static void main(String[] args) {
		 int[] num = {1,2,0,0};
		 int k = 34;

		Solution obj = new Solution();
		List<Integer> result = obj.addToArrayForm(num , k);

		System.out.println(result);
	}
}
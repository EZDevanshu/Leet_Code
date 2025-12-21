import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
    	while(i < arr.length){
    		int correct = arr[i] - 1;
    		if(arr[i] <= arr.length && arr[i] != arr[correct]){
    			swap(arr , i , correct);
    		}
    		else {
    			i++;
    		}
    	}

    	List<Integer> ans = new ArrayList<>();

    	for(int in = 0 ; in < arr.length ; in++){
    		if(arr[in] != in+1){
    			ans.add(in + 1);
    		}
    	} 

    	return ans;
    }
    	public static void swap(int[] arr , int first , int second){
    		int temp = arr[first];
    		arr[first] = arr[second];
    		arr[second] = temp;	
    	}
    }


public class Leet_448{
	public static void main(String[] args) {
		
		int[] arr = {4,3,2,7,8,2,3,1};

		Solution obj = new Solution();
		System.out.println(obj.findDisappearedNumbers(arr));
	}
}




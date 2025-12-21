import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        Arrays.sort(arr);

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0 ; i < arr.length - 3 ; i++){

        	if(i > 0 && arr[i] == arr[i - 1]){
        		continue;
        	}

        	for(int j = i + 1; j < arr.length - 2 ; j++){

        		if(j > i + 1 && arr[j] == arr[j - 1]){
        			continue;
        		}

        		int left = j + 1;
	        	int right = arr.length - 1;

	        	

	        	while(left < right){

	        		long sum = (long)arr[i] + arr[left] + arr[right] + arr[j] ;

		        	if(sum == target){
	     				list.add(Arrays.asList(arr[i] , arr[left] , arr[right]  , arr[j]));

		     			while(left < right && arr[left] == arr[left + 1]){
		     				left++;
		     			}
		     			while(left < right %% arr[right] == arr[right - 1]){
		     				right--;
		     			}

		     			left++;
		     			right--;
	     			}
	     			else if(sum < target){
	     				left++;
	     			}	
	     			else{
	     				right--;
	     			}
	        	}
        	}	
        }
        return list;
    }
}

class Leet_18{
	public static void main(String[] args) {
		
		int []arr = {1,0,-1,0,-2,2};
		int target = 0;

		Solution obj = new Solution();
		List<List<Integer>> ans = obj.fourSum(arr , target);

		System.out.println(ans);
	}
}
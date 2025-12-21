class Solution {
    public int findKthPositive(int[] arr, int k) {	

    	int start = 0 , i = 0;
    	int end = arr.length - 1;

    	while(start <= end){
    		int mid = start + (end - start) / 2;
    		int missingNum = arr[mid] - (mid + 1);

    		if(missingNum < k){
    			start = mid + 1;
    		}
    		else{
    			end = mid - 1;
    		}
    	} 
    	return start + k;
    }
}

class Leet_1539{
	public static void main(String[] args) {
		int[] arr = {2,3,4,7,11};
		int k = 5;

		Solution obj = new Solution();
		System.out.println(obj.findKthPositive(arr , k));
	}
}
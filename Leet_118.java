class Solution {
    public List<List<Integer>> generate(int numRows) {
     	
     	List<List<Integer>> tri = new ArrayList<>();

	     for(int i = 0 ; i < numRows ; i++){
	     	List<Integer> row = new ArrayList<>();
	     	for(int j = 0 ; j <= i ; j++){
	     		if(j==0 || j==i){
	     			row.add(1);
	     		}
	     		else{
	     			int val = tri.get(i - 1).get(j) + tri.get(i - 1).get(j - 1);
	     			row.add(val);
	     		}
	     	}
	     	tri.add(row);
	    }
	    return tri;
	}
}
class Leet_118{
	public static void main(String[] args) {
		int n = 5;

		Solution obj = new Solution();
		List<List<Integer>> result = obj.generate(n);

		System.out.println(result);
	}
}
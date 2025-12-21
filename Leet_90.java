class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        Arrays.sort(arr);

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i = 0 ; i < arr.length ; i++){
            start = 0;

            if(i > 0 && arr[i] == arr[i - 1]){
                start = end + 1;
            }

            end = outer.size() - 1;
            int n = outer.size();

            for(int j = start ; j < n ; j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));

                inner.add(arr[i]);
                outer.add(inner);
            }
        }

        return outer;
    }
}

class Leet_90{
    public static void main(String[] args) {
        int arr[] = {1,2,2};

        Solution obj = new Solution();

        List<List<Integer>> ans = obj.subsetsWithDup(arr);

        System.out.println(ans);
    }
}
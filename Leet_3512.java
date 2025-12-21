class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        for(int x : nums){
            sum+=x;
        }       
        while(sum!= 0){
            if(sum % k == 0){
                return count;
            }
            else{
                sum--;
                count++;
            }
        }

        return count;
    }
}

class Leet_3512{
    public static void main(String[] args) {
        int arr[] = {4,1,3};
        int k = 4;

        Solution obj = new Solution();

        int ans = obj.minOperations(arr , k);

        System.out.println(ans);
    }
}
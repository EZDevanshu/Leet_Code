class Solution {
    public boolean increasingTriplet(int[] arr) {
        
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i : arr){

            if(i <= first){
                first = i;
            }
            else if(i <= second){
                second = i;
            }
            else {
                return true;
            }
        }
        return false;
    }
}


class Leet_334{
    public static void main(String[] args) {
        int[] arr = {20,100,10,12,5,13};

        Solution obj = new Solution();
        boolean ans = obj.increasingTriplet(arr);

        System.out.println(ans);
    }
}
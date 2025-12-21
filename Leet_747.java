class Solution {
    public int dominantIndex(int[] arr) {
        int index = -1;
        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }

        for(int i = 0 ;  i < arr.length ; i++){
            if(i != max && (arr[i] * 2 > max)){
                return -1;
            }
        }
        return index;
    }   
}

class Leet_747{
    public static void main(String[] args) {
        int[] arr = {3,6,1,0};

        Solution obj = new Solution();
        int ans = obj.dominantIndex();

        System.out.println(ans);
    }
}
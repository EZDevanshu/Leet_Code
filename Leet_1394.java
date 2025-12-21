import java.util.*; 
class Solution {
    public int findLucky(int[] arr) {

        int res = -1;
        
        Map<Integer , Integer> freq = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){
            freq.put(arr[i] , freq.getOrDefault(arr[i] , 0) + 1);
        }

        for (int key : freq.keySet()){

            if(key == freq.get(key)){
                res = Integer.max(res , key);
            }   
        }
        return res;
    }
}

class Leet_1394{
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3};

        Solution obj = new Solution();
        int ans = obj.findLucky(arr);

        System.out.println(ans);
    }
}
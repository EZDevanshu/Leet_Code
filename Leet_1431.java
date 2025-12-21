import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list = new ArrayList<>(); 
        int maxCandies = max(candies);

        for(int i = 0 ; i < candies.length ; i++){
            int possible = extraCandies + candies[i];
              list.add(possible >= maxCandies);
        }    
        return list;
    }

    public int max(int[] arr){
        int max = arr[0];

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}

class Leet_1431{
        
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        int ex = 3;

        Solution obj = new Solution();

        System.out.println(obj.kidsWithCandies(arr , ex));
    }
}
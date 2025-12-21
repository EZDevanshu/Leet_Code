class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {       

        boolean[] used = new boolean[baskets.length];
        for(int i = 0 ; i < fruits.length ; i++){
            for(int j = 0 ; j < baskets.length ; j++){

                if(!used[j]){
                    if(baskets[j] >= fruits[i]){
                         used[j] = true;
                        break;
                    }
                }
            }
        }
        int count = 0; 
        for(boolean x : used){
            if(x){
                count++;
            }
        }

        return fruits.length - count;       
    }
}

public class Leet_3477{
    public static void main(String[] args) {
        int fruits[] = {4,2,5};
        int baskets[] = {3,5,4};


        Solution obj = new Solution();
        int result = obj.numOfUnplacedFruits(fruits , baskets);
        System.out.println(result);

    }
}
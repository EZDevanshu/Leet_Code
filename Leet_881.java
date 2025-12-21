    import java.util.*;
    class Solution {
        public int numRescueBoats(int[] people, int limit) {
            Arrays.sort(people);
            int left = 0; 
            int right = people.length - 1;
            int count = 0;

            while(left < right){
                count++;
                if(people[left] + people[right] <= limit){
                    left++;
                    right--;
                }
                else{
                    right--;
               }
            }
            if(left == right){
                count++;
            }
            return count;
        }
    }

class Leet_881{
    public static void main(String[] args) {
        int []arr = {3,1,7};    
        int limit = 7;

        Solution obj = new Solution();
        int ans = obj.numRescueBoats(arr , limit);

        System.out.print(ans);
    }
}
class Solution {
    int count = 0;
    public int numberOfSteps(int num) {

        if(num == 0){
            return count;
        }

        if(num % 2 == 0){
            count++;
            return numberOfSteps(num / 2);
        }
        else{
            count++;
            return numberOfSteps(num - 1);
        }
    }
}  

class Leet_1342{
    public static void main(String[] args) {

        int num = 14;

        Solution obj = new Solution();
        int ans = obj.numberOfSteps(num);

        System.out.println(ans);
        
    }
}
class Solution {
    public int countOdds(int low, int high) {
        return (high + 1)/ 2 - (low) / 2;
    }
}

class Leet_1523{
    public static void main(String[] args) {
        int low = 3;
        int high = 7;

        Solution obj = new Solution();

        System.out.println(obj.countOdds(low , high));
    }
}
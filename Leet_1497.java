
class Leet_1497 {
    public static void main(String[] args) {
        int arr[] = {}
    }
}

class Solution {

    public boolean canArrange(int[] arr, int k) {
        int n = arr.length;

        if(n % 2 != 0){
            return false;
        }
        int i = 0 ;
        int j = arr.length - 1;

        while(i < j){
            int sum = arr[i] + arr[j];

            if(sum % k != 0){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

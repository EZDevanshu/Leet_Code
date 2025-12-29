class Solution {
    public int pivotInteger(int n) {
        int arr[] = new int[n];
        
        for(int i = 0 ; i < n ; i++){
           arr[i] = i + 1; 
        }

        int i = 0;
        int j = arr.length - 1;
        int sum1 = 0;
        int sum2 = 0;
        while(i <= j){
            if(sum1 == sum2 && i == j){
                return arr[i];
            }
            if(sum1 == sum2){
                sum1 += arr[i];
                sum2 += arr[j];
                j--;
                i++;
            }
            else if(sum1 < sum2){
                sum1 += arr[i];
                i++;

            }
            else{
                sum2 += arr[j];
                j--;
            }
        }
        return -1;
    }
}

class Reasoning_2{
    public static void main(String[] args) {
        Solution obj = new Solution();

        int ans = obj.pivotInteger(8);

        System.out.println(ans);
    }
}
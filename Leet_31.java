class Solution {
    public void nextPermutation(int[] arr) {
        int i = arr.length - 1;

        while(i > 0 && arr[i - 1] >= arr[i]){
            i--;
        }

        if(i == 0){
            reverse(arr , 0 , arr.length - 1);
            return;
        }

        int j = arr.length - 1;

        while(j >= i && arr[j] <= ar[i - 1]){
            j--;
        }
        swap(arr , i - 1 , j);
        reverse(arr , i , arr.length - 1);
    }

    private void swap(int arr[] ,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(int arr[] , int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

class Leet_31{
    public static void main(String[] args) {
        int arr[] = {1,2,3};

        Solution obj = new Solution();
        obj.nextPermutation(arr);
    }
}
class Solution {
    public int findMin(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        int min = arr[0];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if( arr[start] < arr[end]){
                min = Math.min(min, arr[start]);
                break;
            }

            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                min = Math.min(min , arr[start]);
                start++;
                end--;
                continue;
            }

            if(arr[mid] <= arr[end]){
                min = Math.min(min , arr[mid]);
                end = mid;
            }
            else{
                min = Math.min(min , arr[mid]);
                start = mid + 1;
            }
        }
        return min;
    }
}

class Leet_154{
    public static void main(String[] args) {
        int arr[] = {10, 1, 10, 10, 10};

        Solution obj = new Solution();
        int ans = obj.findMin(arr);

        System.out.println(ans);
    }
}
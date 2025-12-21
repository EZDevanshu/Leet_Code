class Solution {
    public int maxArea(int[] arr) {

        int maxArea = 0 ;
        int left = 0 , right = arr.lenght - 1;

        while(left < right){
            
            int h = Math.min(arr[left] , arr[right]);
            int w = rigth - left;
            int area = h * w;

            maxArea = Math.max(maxArea , area);
            if(arr[left] < arr[rigth]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}

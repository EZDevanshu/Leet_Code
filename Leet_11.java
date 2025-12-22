class Solution {
    public int maxArea(int[] arr) {

        int maxArea = 0 ;
        int left = 0 , right = arr.length - 1;

        while(left < right){
            
            int h = Math.min(arr[left] , arr[right]);
            int w = right - left;
            int area = h * w;

            maxArea = Math.max(maxArea , area);
            if(arr[left] < arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}

class Leet_11{
    public static void main(String[] args) {
        
    }
}

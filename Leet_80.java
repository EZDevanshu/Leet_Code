class Solution {
    public int removeDuplicates(int[] arr) {

        int k = 2;

        for(int i = 2 ; i < arr.length ; i++){
            if(arr[i] != arr[k - 2]){
                arr[k] = arr[i];
                k++;
            }
        }

        return k;
    }
}


class Leet_80{
    public static void main(String[] args) {
      int arr[] = {1,1,1,2,2,3};

      Solution obj = new Solution();
      int ans = obj.removeDuplicates(arr);

      System.out.println(ans);
    }
}
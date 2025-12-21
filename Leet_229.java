import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : nums){
            map.put(x , map.getOrDefault(x , 0) + 1);
        }

        int minimumFreq = nums.length / 3;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int ele = entry.getKey();
            int val = entry.getValue();

            if(val > minimumFreq){
                list.add(ele);
            }   
        }

        return list;
    }
}

class Leet_229{
    public static void main(String[] args) {
        int arr[] = {2 ,3};

        Solution obj = new Solution();

        List<Integer> ans = obj.majorityElement(arr);

        System.out.println(ans);
    }
}
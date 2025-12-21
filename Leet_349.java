import java.util.*;

class Solution {
    public int[] intersection(int[] num1, int[] num2) {
        HashSet<Integer> set1 = new HashSet<>();
        
        for(int i : num1){
            set1.add(i);
        }

        HashSet<Integer> result = new HashSet<>();
        
        for(int x : num2){
            if(set1.contains(x)){
                result.add(x);
            }
        }

        int arr[] = new int[result.size()];

        Iterator<Integer> it = result.iterator();
        int i = 0;
        while(it.hasNext()){
            int val = it.next();
            arr[i] = val;
            i++;
        }

        return arr;
    }
}

class Leet_349{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of num1");
        int size1 = sc.nextInt();

        System.out.println("Enter size of num2");
        int size2 = sc.nextInt();

        int []num1 = new int[size1];
        int []num2 = new int[size2];

        System.out.println("enter firsts ele");
        for(int i = 0 ; i < size1 ; i++){
            num1[i] = sc.nextInt();
        }

        System.out.println("enter seconds ele");
        for(int i = 0 ; i < size2 ; i++){
            num2[i] = sc.nextInt();
        }

        Solution obj = new Solution();

        int ans[] = obj.intersection(num1 , num2);

        System.out.println("ans");
        for(int i = 0 ; i < ans.length ; i++){
            System.out.println(ans[i]);
        }
    }
}
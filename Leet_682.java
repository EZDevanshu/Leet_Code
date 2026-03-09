import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i < operations.length; i++){
            if(operations[i].equals("+")){
                int t1 = st.peek();
                st.pop();
                int t2 = st.peek();
                st.push(t1);
                st.push(t1 + t2);
            }
            else if (operations[i].equals("D")){
                st.push(st.peek() * 2);
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }

        int sum = 0 ;

        while(!st.isEmpty()){
            sum += st.peek();
            st.pop();
        }
        return sum;
    }
}
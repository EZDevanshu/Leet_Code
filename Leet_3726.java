class Solution {
    public long removeZeros(long n) {
        String s = Long.toString(n);

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != '0'){
                sb.append(s.charAt(i));
            }
        }

        return Long.parseLong(sb.toString());
    }
}

class Leet_3726{
    public static void main(String[] args) {
        long n = 1020030;
        Solution obj = new Solution();
        long ans = obj.removeZeros(n);

        System.out.println(ans);
    }
}
class Solution {
    public boolean checkRecord(String s) {
        int lateCount = 0;
        int absentCount = 0;
        int i = 0;

        while(i < s.length()){
            char ch = s.charAt(i);

            if(ch == 'A'){
                absentCount++;
                if(absentCount >= 2){
                    return false;
                }
            }
            if(ch == 'L'){
                lateCount++;
                if(lateCount >= 3){
                    return false;
                }
            }else{
                lateCount = 0;
            }
            i++;
        }
        return true;
    }
}
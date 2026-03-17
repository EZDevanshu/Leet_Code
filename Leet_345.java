class Solution {
    public String reverseVowels(String s) {

        char [] arr = s.toCharArray();
        int i = 0; 
        int j = s.length() - 1;


        while (i < j){
            while(i < j && !isVowel(arr[i])){
                i++;
            }
            while(i < j && !isVowel(arr[j])){
                j--;
            }

            if(i < j){
                char ch = arr[i];
                arr[i] = arr[j];
                arr[j] = ch;

                i++;
                j--;
            }
        }

        return new String(arr);
    }

    public boolean isVowel(char c)
    {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            return true;

        return false;
    }
}
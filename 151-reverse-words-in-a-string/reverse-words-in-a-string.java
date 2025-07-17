class Solution {
    public static void reverse(char[] str, int low, int high){
        while(low < high){
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++;
            high--;
        }
    }
    public String reverseWords(String s) {
        s = s.trim();
        int n = s.length();
        int j=0;
        char[] str = s.toCharArray();
        for(int i=0; i<n; i++){
            if(str[i] == ' '){
                reverse(str, j, i-1);
                j = i+1;
            }
        }
        reverse(str, j, n-1);
        reverse(str, 0, n-1);
        for(int i=1; i<n; i++){

        }
        StringBuilder sb = new StringBuilder();
        boolean space = false;
        for (char c : str) {
            if (c != ' ') {
                sb.append(c);
                space = true;
            } else if (space) {
                sb.append(' ');
                space = false;
            }
        }
        return sb.toString().trim();
    }
}
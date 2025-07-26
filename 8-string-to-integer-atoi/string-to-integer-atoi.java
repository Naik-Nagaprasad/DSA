class Solution {
    public int myAtoi(String s) {
        int i=0;
        long ans=0;
        int sign=1;

        String str = s.trim();
        if(str.length() == 0) return 0;
        if(str.charAt(0) == '-') sign=-1;
        int MAX = Integer.MAX_VALUE, MIN=Integer.MIN_VALUE;
        i = (str.charAt(0)=='-'||str.charAt(0)=='+')? 1: 0;

        while(i < str.length()){
            if(str.charAt(i)==' ' || !Character.isDigit(str.charAt(i))) break;

            ans = ans * 10 + (str.charAt(i)-'0');

            if(sign==-1 && -1*ans<MIN) return MIN;
            if(sign==1 && ans > MAX) return MAX;
            i++;
        }

        return (int)(ans*sign);
    }
}
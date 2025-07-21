class Solution {
    public int maxDepth(String s) {
        int count=0, res=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                count++;
                res = Math.max(count, res);
            }else if(s.charAt(i) == ')'){
                count--;
            }
        }
        return res;
    }
}
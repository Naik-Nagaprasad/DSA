class Solution {
    public boolean rotateString(String s, String goal) {
        String str = s + s;
        if(s.length() != goal.length())
            return false;
        if(str.indexOf(goal)>=0)
            return true;
        return false;
    }
}
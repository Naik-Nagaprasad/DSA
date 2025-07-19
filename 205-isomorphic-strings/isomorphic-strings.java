class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        HashMap<Character, Character> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char s1 = s.charAt(i);
            char s2 = t.charAt(i);

            if(!map.containsKey(s1)){
                if(!map.containsValue(s2)){
                    map.put(s1, s2);
                }else{
                    return false;
                }
            }else{
                char temp = map.get(s1);
                if(temp != s2)
                    return false;
            }
        }
        return true;
    }
}
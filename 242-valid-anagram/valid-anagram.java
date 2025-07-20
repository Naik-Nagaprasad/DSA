class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[256];
        if(s.length() != t.length())
            return false;
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)]++;
            arr[t.charAt(i)]--;
        }
        for(int i=0; i<256; i++){
            if(arr[i]!=0)
                return false;
        }
        return true;
    }
}
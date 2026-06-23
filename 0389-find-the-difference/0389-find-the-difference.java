class Solution {
    public char findTheDifference(String s, String t) {
        char r=0;
        for(char e:s.toCharArray()){
            r=(char)(r^e);
        }
         for(char e:t.toCharArray()){
            r=(char)(r^e);
        }

        return r;
        
    }
}
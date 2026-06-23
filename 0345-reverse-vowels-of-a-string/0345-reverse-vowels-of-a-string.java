class Solution {
    boolean vowels(char ch){
        return "AEIOUaeiou".indexOf(ch)>=0;
    }
    public String reverseVowels(String s) {
        // we have to reverse the vowels of the string but string is immutable so we make a new char to make changes

        char str[]=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            if(!vowels(str[left])){
                left++;
            }
            else if(!vowels(str[right])){
                right--;
            }
            else{
                // it means vowels so swap
                char temp=str[left];
                str[left]=str[right];
                str[right]=temp;
                left++;
                right--;
            }
        }
        return new String(str);
    }
}
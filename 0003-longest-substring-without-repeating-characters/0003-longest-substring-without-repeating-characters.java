class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[256];
        int left = 0, max = 0;

        for (int right = 0; right < s.length(); right++) {
            map[s.charAt(right)]++;

            while (map[s.charAt(right)] > 1) {
                map[s.charAt(left)]--;
                left++;
            }

            max = Math.max(max, right - left + 1); // this will return the substring
        }
        return max;
    }
}
//dynamic sliding window problem traversing the array if already contains then remove from set and move forward and if not so then add right to the map 
//has been solved by the hash map technique
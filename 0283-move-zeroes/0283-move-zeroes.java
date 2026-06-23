class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) { // here we are simply checking if it is xero or not 
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j++;
            }
        }
    }
}
// making two pointer sane as that of others and checking zeroes for them if not then swapping both of them at the end
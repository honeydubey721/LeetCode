class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums); //sorting the array so that everything come acc.

        int moves = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) { // if curr is less or equal to previous
                int needed = nums[i - 1] + 1; // how much we need we have to store
                moves += needed - nums[i]; // geting the moves for every need
                nums[i] = needed; //updating the array
            }
        }

        return moves;
    }
}
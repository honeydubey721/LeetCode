class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0; // first calculating the total sum

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0; // initialising the leftsum as 0

        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i]; // calculate the right sum by rearrangint the formula

            if (leftSum == rightSum) {
                return i;// if both equals then return the element i
            }

            leftSum += nums[i]; // if not then increase the leftsum element as leftsum++
        }

        return -1; // if not them return -1 at the end
    }
}
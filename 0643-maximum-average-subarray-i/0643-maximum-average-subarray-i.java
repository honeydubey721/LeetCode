class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        int maxSum = sum;
        
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        
        return (double) maxSum / k;
    }
}

// first we initiate the sum them we traverse how much we have to find and then add it to the sum and store the value into the maxsum and then traverse from k to array kength and then update the sum and find maxsum if larger then previous and retuen it
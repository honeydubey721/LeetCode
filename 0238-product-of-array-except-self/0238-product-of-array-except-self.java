class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n]; // making new array to store the ans of size same as nums

        answer[0] = 1; // giving first as 1 for every multiplication

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1]; // storing the left product into the array
        }

        int rightProduct = 1;

        for (int i = n - 1; i >= 0; i--) { // similarly doing for the right as same 
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return answer;
    }
}
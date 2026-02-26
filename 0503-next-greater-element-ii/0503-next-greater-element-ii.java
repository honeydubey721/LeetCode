import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int ind = i % n;

            while (!st.isEmpty() && st.peek() <= nums[ind]) {
                st.pop();
            }

            if (i < n) {
                ans[ind] = st.isEmpty() ? -1 : st.peek();
            }

            st.push(nums[ind]);
        }

        return ans;
    }
}
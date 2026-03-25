import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[][] a = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            a[i][0] = nums[i];
            a[i][1] = i;
        }
        
        Arrays.sort(a, (x, y) -> x[0] - y[0]);
        
        int l = 0, r = n - 1;
        while (l < r) {
            int sum = a[l][0] + a[r][0];
            if (sum == target)
                return new int[]{a[l][1], a[r][1]};
            else if (sum < target) l++;
            else r--;
        }
        
        return new int[]{-1, -1};
    }
}
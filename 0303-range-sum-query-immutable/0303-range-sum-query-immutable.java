// solving this question by making another array as prefix 
class NumArray {

    int[] prefix; // it store the sum of all elements before i 

    public NumArray(int[] nums) {
        prefix = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i]; // i+1 bcz at 0 it store the zero also it..it consists of its sum as well as array sum
        } 
    }

    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left]; // very simple...
    }
}
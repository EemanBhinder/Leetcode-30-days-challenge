
class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] result = new int[n]; // Create a new array to store the running sum
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i]; // Add the current element to the running sum
            result[i] = sum; // Store the running sum in the result array
        }

        return result;
    }
}






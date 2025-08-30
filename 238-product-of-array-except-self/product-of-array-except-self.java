class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        // Step 1: prefix products
        answer[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i - 1] * nums[i - 1]; 
        }

        // Step 2: suffix products
        int temp = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] = answer[i] * temp;
            temp *= nums[i];
        }

        return answer;
    }
}
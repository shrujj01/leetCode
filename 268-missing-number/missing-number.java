class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length== 0){
            return 0;
        }
        int expectedSum = sumOfNNumbers(nums.length);
        int currentSum = 0;

        for(int e : nums){
            currentSum += e;
        }

        return Math.abs(currentSum-expectedSum);
    }

    public int sumOfNNumbers(int n){
        return (n*(n+1))/2;
    }
}
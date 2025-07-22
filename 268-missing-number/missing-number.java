class Solution {
    public int missingNumber(int[] nums) {
        
        if(nums.length==0){
            return 0;
        }

        int totalNums = nums.length;
        //int maxNumber = findMaxNumber(nums);

        int expectedSum = getSum(totalNums);
        int currentSum = 0;
        for(int i =0 ;i<nums.length;i++){
            currentSum = currentSum+nums[i];
        }
        return (expectedSum-currentSum);
    }

    public int getSum(int n){
        if(n==0){
            return 0;
        }
        int sum = (n*(n+1))/2;
        return sum;
    }
     public int findMaxNumber(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=max){
                max=nums[i];
            }
        }
        return max;
     }
}
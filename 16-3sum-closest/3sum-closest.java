class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            int start = i+1;
            int end = nums.length-1;

            while(start<end){
                int sum = nums[i] + nums[start] + nums[end];

                if(Math.abs(target-sum) < Math.abs(target-closestSum)){
                    closestSum = sum;
                }
                if(sum<target){
                    start++;
                }
                else if(sum>target){
                    end--;
                }
                else{
                    return sum;
                }
            }
        }
        return closestSum;
    }
}
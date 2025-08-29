class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int[] result = new int[2];
        while(start<end){
            int sum = nums[start] + nums[end];
            if(sum<target){
                start++;
            }
            else if(sum > target){
                end--;
            }else{
                result[0] = start+1;
                result[1] = end+1;
                return result;
            }
        }
        return result;
    }
}
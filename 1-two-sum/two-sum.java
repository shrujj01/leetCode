class Solution {
    public int[] twoSum(int[] nums, int target) {
        if( nums.length == 0){
            return nums;
        }
        Map<Integer,Integer> numsMap = new HashMap<>();
        int[] indices = new int[2];
        for(int i = 0;i<nums.length;i++){
            int toSearch = target-nums[i];
            System.out.println("toSearch = " + toSearch + " and currently on " + nums[i]);
            if(numsMap.containsKey(toSearch)){
                indices[0] = i;
                indices[1] = numsMap.get(toSearch);
            }
            else{
                numsMap.put(nums[i],i);
            }
        }
        return indices;
    }
}
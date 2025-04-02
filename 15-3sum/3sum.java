class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int start = i+1;
            int end = nums.length-1;
            
            while(start<end){
                int target = nums[i]+nums[start]+nums[end];
                if(target == 0){
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    finalList.add(list);
                    start++;

                    while(nums[start] == nums[start-1] && start<end){
                        start++;
                    }
                }
                else if(target>0){
                    end--;
                }
                else{
                    start++;
                }
            }
        }
        return finalList;
    }
}
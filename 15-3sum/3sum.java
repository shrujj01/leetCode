class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for(int i = 0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int start = i+1, end = nums.length-1;
            while(start<end){
                
                int sum = nums[i] + nums[start] + nums[end];
                if(sum == 0){
                    List<Integer> triplet = new ArrayList<Integer>();
                    triplet.add(nums[i]);
                    triplet.add(nums[start]);
                    triplet.add(nums[end]);

                    finalList.add(triplet);
                    start++;

                    while(nums[start] == nums[start-1] && start<end){
                    start++;
                    }
                }
                if(sum<0){
                    start++;
                }
                else{
                    end--;
                }
            }
        }

        return finalList;
    }
}
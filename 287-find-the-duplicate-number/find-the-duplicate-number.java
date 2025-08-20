class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int element : nums){
            if(set.contains(element)){
                return element;
            }
            set.add(element);
        }
        return -1;
    }
}
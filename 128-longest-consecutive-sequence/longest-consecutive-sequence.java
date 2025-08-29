class Solution {
    public int longestConsecutive(int[] nums) {

     HashSet<Integer> numsSet = new HashSet<>();
        
        for(int e:nums){
            numsSet.add(e);
        }
        int maxSequenceLength = 0;
        for(int i =0;i<nums.length;i++){
            int currentLength = 1;
            int currentNum = nums[i];
                if(!numsSet.contains(currentNum-1)){
                    while(numsSet.contains(currentNum+1)){
                        numsSet.remove(currentNum);
                        currentNum +=1;
                        currentLength += 1;
                }
                maxSequenceLength = Math.max(maxSequenceLength,currentLength);
            }   
        }
        return maxSequenceLength;
    }
}
class Solution {

    //trying using bucketSort
    // bucketSort -> array with index as frequency
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> count = new HashMap<>();

        for(int element : nums){
            count.put(element, count.getOrDefault(element,0)+1);
        }

        List<Integer>[] bucket = new List[nums.length+1];

        for(int i = 0;i<bucket.length;i++){
            bucket[i] = new ArrayList<>();
        }

        for(int i : count.keySet()){
            bucket[count.get(i)].add(i);
        }

         List<Integer> temp = new ArrayList<>();

         for(int i = bucket.length-1;i>=0;i--){
            List<Integer> list = bucket[i];

            for(int j : list){
                temp.add(j);
            }
         }

         while(k-->0){
            result[k] = temp.get(k);
         }

        return result;
    }
}
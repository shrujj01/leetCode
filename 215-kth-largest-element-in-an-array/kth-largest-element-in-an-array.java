class Solution {
    public int findKthLargest(int[] nums, int k) {
        //Trying using heapSort
        
        Queue<Integer> minHeap = new PriorityQueue<>();
        for(int i : nums){
            
            minHeap.add(i);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        return minHeap.poll();
    }
}
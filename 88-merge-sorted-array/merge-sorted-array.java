class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end1 = m-1;
        int end2 = n-1;
        int ptr = m+n-1;

        while(end2>=0){
            if(end1>=0 && nums1[end1] > nums2[end2]){
                

                nums1[ptr] = nums1[end1];
                end1--;
                ptr--;
            }
            else{
                nums1[ptr] = nums2[end2];
                end2--;
                ptr--;
            }
        }
    }
}
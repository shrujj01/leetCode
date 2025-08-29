class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int mostWater = Integer.MIN_VALUE;

        while(start<end){
            if(height[start]<height[end]){
                mostWater = Math.max(mostWater, height[start]*Math.abs(start-end));
                start++;
            }else{
                mostWater = Math.max(mostWater, height[end]*Math.abs(start-end));
                end--;
            }
        }
        return mostWater;
    }
}
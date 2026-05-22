class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int result = 0;
        while(left < right){
            int width = right - left;
            int maxArea = Math.min(heights[left] , heights[right]);

            int area = width * maxArea;

            
            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
            result = Math.max(result , area);
        }
        return result;
    }
}

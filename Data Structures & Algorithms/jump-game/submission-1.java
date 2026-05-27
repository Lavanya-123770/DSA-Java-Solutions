class Solution {
    public boolean canJump(int[] nums) {
        int right = nums.length - 1;
        for(int i = nums.length - 2 ; i >= 0 ; i--){
            if(i + nums[i] >= right){
                right = i;
            }
        }
        return right == 0;
    }
}

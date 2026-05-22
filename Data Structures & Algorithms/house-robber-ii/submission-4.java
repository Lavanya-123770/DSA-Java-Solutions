class Solution {
    public int rob(int[] nums) {
       if(nums.length == 1) return nums[0];
      int pick =  robHelper(nums , 0 , nums.length - 2);
      int notpick = robHelper(nums , 1 , nums.length - 1);

       return Math.max(pick , notpick);
    }
    public int robHelper(int nums[] , int start , int end){
       int prev2 = 0;
       int prev1 = 0;
       for(int i = start; i <= end ;i++){
        int pick = prev2 + nums[i];
        int notpick = prev1;

        int curr = Math.max(pick , notpick);

        prev2 = prev1;
        prev1 = curr;
       }
       return prev1;
    }
}

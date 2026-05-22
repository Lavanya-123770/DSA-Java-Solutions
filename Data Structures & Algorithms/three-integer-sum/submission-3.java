class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ;i < nums.length - 2 ; i++){
            if(nums[i] > 0) break;
            if( i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int curr = nums[left] + nums[i] + nums[right];

                if(curr > 0){
                    right--;
                }else if(curr < 0){
                    left++;
                }else{
                    list.add(Arrays.asList(nums[left] , nums[i] , nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                }
            }
        }
        return list;
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        int count = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                int len = 1;
                while(set.contains(num + len)){
                    len++;
                }
                count = Math.max(count , len);
            }
        }
        return count;
    }
}

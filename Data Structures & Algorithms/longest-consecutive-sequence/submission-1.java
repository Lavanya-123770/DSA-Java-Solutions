class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set = new HashSet<>();
        int res = 0;
        for(int i  : nums){
            set.add(i);
        }
        for(int i : nums){
            if(!set.contains(i - 1)){
                int len = 1;
                while(set.contains(i + len)){
                    len++;
                }
                res = Math.max(res , len);
            }
        }
        return res;
    }
}

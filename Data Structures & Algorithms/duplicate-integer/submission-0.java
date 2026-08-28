class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        return (hs.size() != n);
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        int[] ans= new int[2];
        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int other = target-nums[i];
          
            if(hmap.containsKey(other)){
                int index = hmap.get(other);
                if(index != i){
                   ans[0]=i;
                   ans[1]=index;
                   break;
                }
            }

        }
        return ans;
    }
}

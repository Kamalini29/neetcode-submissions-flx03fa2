class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            int dif = target - nums[i];
            if(set.containsKey(dif)){
                return new int [] {set.get(dif), i};
            }
            set.put(nums[i], i);
        }

        return new int[] {};

    }
}

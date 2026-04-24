class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> store = new HashSet<>();
        for(int n : nums){
            store.add(n);
        }
        for(int n : nums){
            int s = 0;
            int curr = n;
            while(store.contains(curr)){
                s++;
                curr++;
            }
            res = Math.max(res, s);
        }
        return res;
    }
}

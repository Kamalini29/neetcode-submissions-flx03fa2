class Solution {
    public int majorityElement(int[] nums) {
        int max = 0;
        int maxC = 0;
        int n = nums.length;
        for(int nf : nums){
            int count = 0; 
            for(int i=0; i<n; i++){
                if(nums[i]==nf){
                    count++;
                }
            }
            if(count> maxC){
                maxC= count;
                max = nf;
            }
            count=0;
        }
        return max;
    }
}
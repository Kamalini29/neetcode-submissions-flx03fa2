
class Solution {
    public int subarraySum(int[] nums, int k) {
            Map<Integer, Integer> prefixFreq = new HashMap<>();
                    prefixFreq.put(0, 1);  // Empty prefix before index 0
                            
                                    int count = 0;
                                            int prefixSum = 0;
                                                    
                                                            for (int num : nums) {
                                                                        prefixSum += num;
                                                                                    
                                                                                                // Count prior prefixes where prefixSum - k matches
                                                                                                            count += prefixFreq.getOrDefault(prefixSum - k, 0);
                                                                                                                        
                                                                                                                                    // Update frequency of current prefix sum
                                                                                                                                                prefixFreq.put(prefixSum, prefixFreq.getOrDefault(prefixSum, 0) + 1);
                                                                                                                                                        }
                                                                                                                                                                
                                                                                                                                                                        return count;
                                                                                                                                                                            }
                                                                                                                                                                            }
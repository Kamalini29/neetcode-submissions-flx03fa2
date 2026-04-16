public class MyHashMap {
    private static final int BUCKETS = 10007;  // Prime number for good distribution
    private List<int[]>[] table;               // Array of buckets (key-value pairs)
    
    /** Initialize HashMap with fixed-size bucket array */
    @SuppressWarnings("unchecked")
    public MyHashMap() {
        table = new List[BUCKETS];
        for (int i = 0; i < BUCKETS; i++) {
            table[i] = new ArrayList<>();
        }
    }
    
    /** Hash function: key % buckets */
    private int getHash(int key) {
        return key % BUCKETS;
    }
    
    /** Insert/update (key, value) pair - O(1) avg */
    public void put(int key, int value) {
        int index = getHash(key);
        List<int[]> bucket = table[index];
        
        // Update if key exists
        for (int[] pair : bucket) {
            if (pair[0] == key) {
                pair[1] = value;
                return;
            }
        }
        // Insert new pair
        bucket.add(new int[]{key, value});
    }
    
    /** Get value by key, return -1 if not found - O(1) avg */
    public int get(int key) {
        int index = getHash(key);
        List<int[]> bucket = table[index];
        
        for (int[] pair : bucket) {
            if (pair[0] == key) {
                return pair[1];
            }
        }
        return -1;
    }
    
    /** Remove key-value pair - O(1) avg */
    public void remove(int key) {
        int index = getHash(key);
        List<int[]> bucket = table[index];
        bucket.removeIf(pair -> pair[0] == key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
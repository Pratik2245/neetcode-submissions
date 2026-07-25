class Solution {
    public boolean hasDuplicate(int[] nums) {

      HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) { // add() returns false if element already exists
                return true;
            }
        }

        return false;
    }
}
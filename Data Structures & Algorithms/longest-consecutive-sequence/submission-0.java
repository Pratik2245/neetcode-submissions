class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        int longest = 0;
        for (int num : hashSet) {
            if (!hashSet.contains(num - 1)) {
                int current = num;
                int length = 1;
                while (hashSet.contains(current + 1)) {
                    current++;
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}

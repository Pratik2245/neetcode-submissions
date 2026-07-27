class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> anagramsGroup = new ArrayList<>();
        // boolean[] visited = new boolean[strs.length];
        // for (int i = 0; i < strs.length; i++) {
        //     if (visited[i]) {
        //         continue;
        //     }
        //     List<String> list = new ArrayList<>();
        //     list.add(strs[i]);
        //     visited[i] = true;
        //     for (int j = i + 1; j < strs.length; j++) {
        //         if (!visited[j] && checkAnagram(strs[i], strs[j])) {
        //             list.add(strs[j]);
        //             visited[j] = true;
        //         }
        //     }
        //     anagramsGroup.add(list);
        // }
        // return anagramsGroup;
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);

        }
        return new ArrayList<>(map.values());
    }
    public static boolean checkAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

}

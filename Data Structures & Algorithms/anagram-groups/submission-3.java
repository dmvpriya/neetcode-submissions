class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedS = Arrays.toString(chars);

            map.putIfAbsent(sortedS, new ArrayList<>());

            map.get(sortedS).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}

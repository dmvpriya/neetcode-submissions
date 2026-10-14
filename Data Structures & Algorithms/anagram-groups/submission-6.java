class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String sortedS = Arrays.toString(ch);
            mp.putIfAbsent(sortedS, new ArrayList<>());

            mp.get(sortedS).add(strs[i]);
        }
        return new ArrayList<>(mp.values());
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp  = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);

            String sortedS = Arrays.toString(chars);
            mp.putIfAbsent(sortedS, new ArrayList<>());

            mp.get(sortedS).add(strs[i]);
        }
        return new ArrayList<>(mp.values());
    }
}

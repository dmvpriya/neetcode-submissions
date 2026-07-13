class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();

        for(int i =0;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedS = Arrays.toString(chars);
            res.putIfAbsent(sortedS, new ArrayList<>());

            res.get(sortedS).add(strs[i]);
        }

        return new ArrayList<>(res.values());
    }
}

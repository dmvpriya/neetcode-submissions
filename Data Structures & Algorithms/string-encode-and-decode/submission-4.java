class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String str : strs){
            res.append((char) str.length());
            res.append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int len = str.charAt(i);
            i++;
            res.add(str.substring(i,i+len));
            i += len;
        }
        return res;
    }
}

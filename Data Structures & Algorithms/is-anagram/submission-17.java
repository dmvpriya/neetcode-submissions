class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length()!=t.length()){
        //     return false;
        // }
        // int[] res = new int[26];
        // for(int i = 0;i<s.length();i++){
        //     res[s.charAt(i)-'a']++;
        //     res[t.charAt(i)-'a']--;
        // }

        // for(int i: res){
        //     if(i!=0){
        //         return false;
        //     }
        // }
        // return true;

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            return true;
        } else {
            return false;
        }

    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        // Hashtable<Character, Integer> s1 = new Hashtable<>();
        // Hashtable<Character, Integer> s2 = new Hashtable<>();
        // for(char ch:s.toCharArray()){
        //     if(s1.containsKey(ch)){
        //         s1.put(ch, s1.get(ch)+1);
        //     } else{
        //         s1.put(ch,1);
        //     }
        // }
        // for(char ch:t.toCharArray()){
        //     if(s2.containsKey(ch)){
        //         s2.put(ch, s2.get(ch)+1);
        //     } else{
        //         s2.put(ch,1);
        //     }
        // }
        // if(s1.equals(s2)){
        //     return true;
        // } else {
        //     return false;
        // }

        // To reduce the space complexity
        // Hashtable<Character, Integer> s1 = new Hashtable<>();
        // for(char ch:s.toCharArray()){
        //     s1.put(ch, s1.getOrDefault(ch, 0)+1);
        // }
        // Hashtable<Character, Integer> s2 = new Hashtable<>();
        // for(char ch:t.toCharArray()){
        //     s2.put(ch, s2.getOrDefault(ch, 0)+1);
        // }
        // if(s1.equals(s2)){
        //     return true;
        // } else{
        //     return false;
        // }

        int[] res = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0;i<s.length();i++){
            res[s.charAt(i)-'a']++;
            res[t.charAt(i)-'a']--;
        }

        for (int count : res) {
            if (count != 0)
                return false;
        }

        return true;

    }
}

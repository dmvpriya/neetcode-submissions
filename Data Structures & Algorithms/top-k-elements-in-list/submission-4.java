class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for( int i =0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        // List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());

        // Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
        //     public int compare(Map.Entry<Integer, Integer> o1,
        //                        Map.Entry<Integer, Integer> o2){
        //                     return o2.getValue().compareTo(o1.getValue());
        //     }
        // });

        // HashMap<Integer, Integer> res = new LinkedHashMap<>();
        // for(Map.Entry<Integer, Integer> m : list){
        //     res.put(m.getKey(),m.getValue());
        // }

        // int[] result = new int[k];
        // int i = 0;
        // for(Map.Entry<Integer, Integer> m : res.entrySet()){
        //     if(i == k){
        //         break;
        //     }
        //     result[i++] = m.getKey();
        // }
        // return result;

        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int count = entry.getValue();

            if(bucket[count] == null){
                bucket[count] = new ArrayList<>();
            }
            bucket[count].add(entry.getKey());
        }

        int [] res = new int[k];
        int index = 0;
        for(int i = bucket.length-1;i>=0 && index<k;i--){
            if(bucket[i]!=null){
                for(int num:bucket[i]){
                    res[index++] = num;
                    if(index == k){
                        break;
                    }
                }
            }
        }
        return res;
    }
}

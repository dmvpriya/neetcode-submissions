class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        int[] arr = new int[k];
       
        for(int i = 0;i<k;i++){
            int max = 0;
            int maxElement = 0;
            for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
                if(entry.getValue()> max){
                    max = entry.getValue();
                    maxElement = entry.getKey();
                }
            }
            arr[i] = maxElement;

            mp.remove(maxElement);
        }
        return arr;
    }
}

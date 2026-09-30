class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int diff = target - nums[i];
            if(hm.containsKey(diff)){
                return new int[]{hm.get(diff),i};
            }

            hm.put(nums[i],i);
        }
        return new int[]{};

        // Map<Integer, Integer> map = new HashMap<>();
        // int i = 0;

        // while(nums.length){
        //     if(map.containsKey(nums[i])){
        //         return new int[]{map.get(nums[i]),i};
        //     }else {
        //         map.put(target-nums[i],i);
        //         i++;
        //     }
        // }
        // return new int[]{-1,-1};
    }
}

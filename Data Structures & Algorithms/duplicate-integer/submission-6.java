class Solution {
    public boolean hasDuplicate(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        // for (int i : nums){
        //     if(set.contains(i)){
        //         return true;
        //     }else{
        //         set.add(i);
        //     }
        // }
        // return false;

        //To reduce the space complexity
        Arrays.sort(nums);
        for (int i = 0; i< nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
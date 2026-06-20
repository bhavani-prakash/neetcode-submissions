class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Better solution using the Hashmaps

        
        HashMap<Integer, Integer> h = new HashMap<>();
        

        for(int i=0;i<nums.length;i++){
            int val=target-nums[i];
            if(h.containsKey(val)){
                return new int[]{h.get(val),i};

            }else{
                h.put(nums[i],i);
            }
        }
         return new int[]{};
        
    }
}

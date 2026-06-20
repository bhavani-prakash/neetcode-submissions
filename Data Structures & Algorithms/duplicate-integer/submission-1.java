class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean isdupli=false;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[i]==nums[j]){
                    isdupli=true;
                    return isdupli;
                }
            }
           
        }
        return isdupli;
        
    }
}
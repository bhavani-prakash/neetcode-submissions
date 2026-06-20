
class Solution {
    public boolean hasDuplicate(int[] nums) {
        // boolean isdupli=false;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(i==j){
        //             continue;
        //         }
        //         if(nums[i]==nums[j]){
        //             isdupli=true;
        //             return isdupli;
        //         }
        //     }
           
        // }
        // return isdupli;

        // Hashtable<Integer,Integer> ht = new Hashtable<>();
        // for(int num:nums){
        //     if(ht.containsKey(num)){
        //         return true;
        //     }
        //     ht.put(num,1);
        // }
        // return false;

        HashSet<Integer> a=new HashSet<Integer>();

        for(int num:nums){
            a.add(num);
        }
        return (a.size()==nums.length?false:true);
        
    }
}
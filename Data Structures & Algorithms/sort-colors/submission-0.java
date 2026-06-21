class Solution {
    public void sortColors(int[] nums) {

          // Brute Force Approach is Sorting using the sorting algos 

        //BETTER SOLUTION 


        //  int z=0;
        // int one=0;
        // int two=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0)
        //       z++;
        //     else if(nums[i]==1)
        //       one++;
        //     else
        //       two++;
        // }
        // for(int i=0;i<z;i++){
        //     nums[i]=0;
        // }
        // for(int i=z;i<z+one;i++){
        //     nums[i]=1;
        // }
        // for(int i=one+z;i<nums.length;i++){
        //     nums[i]=2;
        // }



        // OPTIMAL  SOLUTION --DUTCH NATIONAL FLAG ALGO 

       

        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                // swap mid and low and incriment the mid and low variables 
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                // if the mid is equal to 1 . just do mid ++;
                mid++;
            }
            else{
                // if the mid id 2 swap it with the high and and decrement the high 
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;

                high--;
            }
        }
        
    }
}